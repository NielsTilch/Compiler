package TDS;

import generationCode.DescripteurClasse;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static java.lang.Math.max;

public class TDS {
    private final int numeroRegion;
    private final int numeroImbrication;

    private ArrayList<TDS> listFils;
    private final TDS parent;
    private final LinkedHashMap<String, Element> mapElement;          // --> pour ajouter des éléments dans l'ordre

    private int deplacementMax = 4; //--> on commence au-dessus du chainage statique et dynamique, sachant que la base est situé au dessus de l'@ de retour
    private int deplacementMin = -2;  //--> on commence en dessous de l'adresse de retour , sachant que la base est situé au dessus de l'@ de retour
    private static int deplacementStatic = 0;//--> on commence les statics à la base de la zone

    private static int nbRegion = 0;
    private static int numImbMax;

    private static int countIf=0;
    private static int countWhile=0;
    private static ArrayList<Integer> arrayWhile;
    private static Integer lienParente = 0;

    private String typeTDS = "";    // MAIN, CONSTRUCTEUR, METHODE, THEN, ELSE, WHILE, ROOT, BLOC, CLASSE
    private String name = "";

    private DescripteurClasse descripteur;
    private static LinkedHashMap<String, DescripteurClasse> listDescripteur = new LinkedHashMap<>();

    private int nbParam = 0; //--> c'est pour l'analyse sémantique des appels de méthodes et de constructeur

    private int tailleClasse = 2; //--> pour générer les descripteurs
    private static int offsetTotalDesc =0;
    private int offsetClasse;
    // --------------------------------------------------- CONSTRUCTEUR ----------------------------------------------------- //

    public TDS() {
        this.numeroRegion = 0;
        this.numeroImbrication = 0;
        this.listFils = new ArrayList<>();

        // faire figurer les fonctions qui existent de base (print, tostring --> Integer, ...)

        this.parent = null;
        this.mapElement = new LinkedHashMap<>();

        numImbMax = 0;
        typeTDS = "ROOT";

    }

    public TDS(TDS pere, String typeTDS, String name) {
        this.numeroRegion = ++nbRegion;
        this.numeroImbrication = pere.getNumImb() + 1;
        this.listFils = new ArrayList<>();

        this.parent = pere;
        this.mapElement = new LinkedHashMap<>();

        numImbMax = max(numeroImbrication, numImbMax);
        this.typeTDS = typeTDS;             //--> Peut être : MAIN, CONSTRUCTEUR, CLASSE, BLOC, METHODE, THEN, ELSE, WHILE
        this.name = name;                   //--> Contient le nom de méthode/classe associé à la TDS ou le mot main pour le bloc principal, sinon, un ""

        if (typeTDS.equals("CLASSE")) {
            deplacementMax = 0; //on n'avance que d'une adresse pour le descriteur
            this.descripteur = new DescripteurClasse(); //--> Si c'est une classe, on crée un descripteur associé
            listDescripteur.put(this.name, this.descripteur);
        }
    }

    // --------------------------------------------------- RAJOUT D'ELEMENTS ----------------------------------------------------- //

    //param, attribut
    public void addElement(Boolean isStatic, String type, Boolean isPrim, String name, int deplacement) {
        //Si c'est un static, il faut le mettre dans la zone des statics et n'augmenter les déplacement que des statics et pas du reste
        if (isStatic) {
            this.mapElement.put(name, new Element(isStatic, type, isPrim, name, TDS.deplacementStatic));
            this.retrouveMesStatics().mapElement.put(name, new Element(isStatic, type, isPrim, name, deplacementStatic));
            deplacementStatic += deplacement;
        }
        else if (deplacement < 0) { //--> si le deplacement est négatif, on diminue le deplacementMin qui correspond au deplacement du dernier paramètre
            this.mapElement.put(name, new Element(isStatic, type, isPrim, name, deplacementMin));

            this.deplacementMin += deplacement;
            this.nbParam++;
        } else {    //--> sinon on augmente le deplacement max
            this.deplacementMax += deplacement;
            this.mapElement.put(name, new Element(isStatic, type, isPrim, name, deplacementMax));
        }

        //--> en fonction des attributs de la classe, on va augmenter la taille d'un objet de la classe
        if (this.descripteur != null && deplacement > 0 && !isStatic) {
            for (String nomClasse : listDescripteur.keySet()) {
                if (nomClasse.equals(type)) {
                    descripteur.updateTailleObj(listDescripteur.get(nomClasse).getTailleObj());
                    tailleClasse += deplacement;
                }
            }
        }
    }

    //méthode
    public void addElement(Boolean isStatic, Boolean isOverride, String typeRetour, String name, int numRegion) {
        mapElement.put(name, new Element(isStatic, isOverride, typeRetour, name, numRegion));

        //--> on rajoute l'adresse de la méthode dans le descripteur de la classe
        this.descripteur.ajoutMethode(name); //--> avec les etiquettes du code assembleur
    }

    //classe
    public void addElement(Boolean classe, String name, String extend, int numRegion) {
        mapElement.put(name, new Element(classe, name , extend, numRegion));
    }

    //if et while
    public void addElement(TDS fils1, TDS fils2) {
        if (fils2 == null) {
            mapElement.put("WHILE" + countWhile, new Element(fils1, null));
        } else {
            mapElement.put("BLOCIF" + countIf , new Element(fils1, fils2));
        }
    }

    //pere
    public void addElement(TDS pere) {
        this.mapElement.put( lienParente.toString() , new Element(pere));
        lienParente++;
    }


    public void addChild(TDS tdsFils) {
        this.listFils.add(tdsFils);
    }

    // --------------------------------------------------- RECUPERATION D'ELEMENTS ----------------------------------------------------- //

    public int getNumImb() {
        return this.numeroImbrication;
    }

    public int getNumRegion() {
        return this.numeroRegion;
    }

    public int getNbRegion() {
        return nbRegion;
    }

    public int getNbParam() {
        return this.nbParam;
    }

    public ArrayList<TDS> getListFils() {
        return this.listFils;
    }

    public LinkedHashMap<String, Element> getMapElement(){
        return this.mapElement;
    }

    public TDS getParent() {
        return this.parent;
    }

    public String getTypeTDS() {
        return this.typeTDS;
    }

    public String getName() {
        return name;
    }

    public int getDeplacementMax() {
        return this.deplacementMax;
    }

    public int getDeplacementMin() { return this.deplacementMin;}

    public Integer getMaxImbrication(){
        if(this.listFils.isEmpty()){return this.numeroImbrication;}
        else {
            int imbMax = 1;
            for (TDS tdsFils: listFils) {
                imbMax = max(imbMax, tdsFils.getMaxImbrication());
            }
            return imbMax;
        }
    }

    public TDS getMainTDS() {
        for (TDS tds : this.listFils) {
            if (tds.getTypeTDS().equals("MAIN")){return tds;}
        }
        return null;
    }

    public int getNbMethInClass(){
        int count = 0;
        for (String name : mapElement.keySet()) {
            if(mapElement.get(name).getNature().equals("methode")||
                mapElement.get(name).getNature().equals("classe") && !mapElement.get(name).getClasse())
                    {count++;}
        }
        return count;
    }

    public int getTailleObjet(){ return tailleClasse;}

    public int getOffsetClasse() {
        return offsetClasse;
    }

    public static int getOffsetTotalDesc() {
        return offsetTotalDesc;
    }

    public static int getCountIf() {
        return countIf;
    }

    public static int getCountWhile() {
        return countWhile;
    }

    public DescripteurClasse getDescripteur() {
        if (typeTDS.equals("CLASSE")) {
            return this.descripteur;
        } else {
            DescripteurClasse descripteurVide = new DescripteurClasse();

            System.out.println("\n---------------------------------------------------------------------------------\n" +
                    " TU AS ESSAYÉ DE PRENDRE UN DESCRIPTEUR QUI N'EST PAS CELUI D'UNE CLASSE" +
                    "\n Tu es dans la tds : " + name + " de type : " + typeTDS +
                    "\n---------------------------------------------------------------------------------\n");
            return descripteurVide;
        }
    }

    // --------------------------------------------------- AFFICHAGE D'ELEMENTS ----------------------------------------------------- //

    public void afficherTDS() {
        System.out.println("--------------------------- " + "TDS " + numeroRegion + ", " + numeroImbrication + " ---------------------------");
        System.out.println("/-/ " + name + " /-/");
        for (String name : mapElement.keySet()) {
            mapElement.get(name).afficherElement();
        }
    }

    public void afficherToutesTDS() {
        afficherTDS();
        for (TDS fils : listFils) {
            fils.afficherToutesTDS();
        }
    }

    // ------------------------------------------------------ QUELQUES SETTERS ------------------------------------------------------ //

    public void setName(String name) {this.name = name;}

    public void setOffsetClasse(int offsetClasse) {
        this.offsetClasse = offsetClasse;
    }

    public static void addToOffsetTotalDesc(int n) {
        TDS.offsetTotalDesc += n;
    }

    public static void addToCountIf(){
        countIf++;
    }

    public static void addToCountWhile(){
        countWhile++;
    }

    //------------------------------------------------------ RETROUVONS DES TDS ----------------------------------------------------- //

    public TDS retrouveMaTDS(String name, String typeTDS) {
        for (int i = 0; i< this.getListFils().size(); i++) {
            if (this.getListFils().get(i).getName().equals(name) && this.getListFils().get(i).getTypeTDS().equals(typeTDS)) {
                return this.getListFils().get(i);
            }
        }

        return this;
    }

    public TDS retrouveMonRoot(){
        TDS tdsRoot = this;
        while (!tdsRoot.getTypeTDS().equals("ROOT")){
            tdsRoot = tdsRoot.getParent();
        }
        return tdsRoot;
    }

    public TDS retrouveMaTDSDeClasse(String name){
        return this.retrouveMonRoot().retrouveMaTDS(name, "CLASSE");
    }

    public TDS retrouveMesStatics(){
        return this.retrouveMonRoot().retrouveMaTDS("static", "STATIC");
    }
}
