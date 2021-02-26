package TDS;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static java.lang.Math.max;

public class TDS {
    private final int numeroRegion;
    private final int numeroImbrication;

    private ArrayList<TDS> listFils = new ArrayList<>();
    private final TDS parent;
    private final LinkedHashMap<String, Element> mapElement;          // --> pour ajouter des éléments dans l'ordre

    private static int deplacementMax;
    private static int deplacementMin;

    private static int nbRegion = 0;
    private static int numImbMax;

    private static Integer nbIf = 0;
    private static Integer lienParente = 0;
    private static Integer nbWhile = 0;


    private String typeTDS = "";    // MAIN, CONSTRUCTEUR, METHODE, THEN, ELSE, WHILE, ROOT, BLOC, CLASSE
    private String name = "";

    private int nbParam = 0; //--> c'est pour l'analyse sémantique des appels de méthodes et de constructeur

    // --------------------------------------------------- CONSTRUCTEUR ----------------------------------------------------- //

    public TDS() {
        this.numeroRegion = 0;
        this.numeroImbrication = 0;

        // faire figurer les fonctions qui existent de base (print, tostring --> Integer, ...)

        this.parent = null;
        this.mapElement = new LinkedHashMap<>();

        this.numImbMax = 0;
        typeTDS = "ROOT";
    }

    public TDS(TDS pere, String typeTDS, String name) {
        this.numeroRegion = ++nbRegion;
        this.numeroImbrication = pere.getNumImb() + 1;

        this.parent = pere;
        this.mapElement = new LinkedHashMap<>();

        this.numImbMax = max(numeroImbrication, numImbMax);
        this.typeTDS = typeTDS;             //--> Peut être : MAIN, CONSTRUCTEUR, CLASSE, BLOC, METHODE, THEN, ELSE, WHILE
        this.name = name;                   //--> Contient le nom de méthode/classe associé à la TDS ou le mot main pour le bloc principal, sinon, un ""
    }

    // --------------------------------------------------- RAJOUT D'ELEMENTS ----------------------------------------------------- //

    //param, attribut
    public void addElement(Boolean isStatic, String type, Boolean isPrim, String name, int deplacement) {
        if (deplacement < 0) {
            this.nbParam++;
        }
        mapElement.put(name, new Element(isStatic, type, isPrim, name, deplacement));
    }

    //méthode
    public void addElement(Boolean isStatic, Boolean isOverride, String typeRetour, String name, int numRegion) {
        mapElement.put(name, new Element(isStatic, isOverride, typeRetour, name, numRegion));
    }

    //classe
    public void addElement(Boolean classe, String name, String extend, int numRegion) {
        mapElement.put(name, new Element(classe, name , extend, numRegion));
    }

    //if et while
    public void addElement(TDS fils1, TDS fils2) {
        if (fils2 == null) {
            mapElement.put("WHILE" + nbWhile.toString(), new Element(fils1, null));
            nbWhile++;
        } else {
            mapElement.put("BLOCIF" + nbIf.toString() , new Element(fils1, fils2));
            nbIf++;
        }
    }

    //pere
    public void addElement(TDS pere) {
        mapElement.put( lienParente.toString() , new Element(pere));
        lienParente++;
    }


    public void addChild(TDS tdsFils) {
        listFils.add(tdsFils);
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

    // --------------------------------------------------- AFFICHAGE D'ELEMENTS ----------------------------------------------------- //

    public void afficherTDS() {
        System.out.println("--------------------------- " + "TDS " + numeroRegion + ", " + numeroImbrication + " ---------------------------");
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

}
