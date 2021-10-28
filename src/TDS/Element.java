package TDS;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class Element {

    private String nature = "";                     //--> pour le switch case d'affichage d'éléments
    private String type = "";                       //--> contient type d'attr/param et typeRetour méthode
    private String name = "";
    private Boolean classe = false;
    private int deplacement = 0;

    private String extend = "";
    private Boolean isStatic = false;
    private Boolean isOverride = false;

    private int numRegion;

    private final int[] numReg = {0, 0};
    private final int[] numImb = {0, 0};

    private int numRegPere;
    private int numImbPere;

    // param ou attribut
    public Element(Boolean isStatic, String type, Boolean isPrim, String name, int deplacement) {
        this.nature = "paramAttr";

        this.isStatic = isStatic;
        this.type = type;
        this.name = name;
        this.deplacement = deplacement;
    }

    //if et while
    public Element(TDS fils1, TDS fils2) {
        this.nature = "boucle";

        if (fils2 != null) {
            this.numReg[1] = fils2.getNumRegion();
            this.numImb[1] = fils2.getNumImb();
        }
        this.numReg[0] = fils1.getNumRegion();
        this.numImb[0] = fils1.getNumImb();
    }

    //ligne père
    public Element(TDS pere) {
        this.nature = "pere";

        this.numRegPere = pere.getNumRegion();
        this.numImbPere = pere.getNumImb();

    }

    // méthode
    public Element(Boolean isStatic, Boolean isOverride, String typeRetour, String name, int numRegion) {
        this.nature = "methode";
        this.isStatic = isStatic;
        this.isOverride = isOverride;

        this.type = typeRetour;
        this.name = name;

        this.numRegion = numRegion;
    }

    // classe
    public Element(Boolean classe, String name , String extend, int numRegion) {
        this.nature = "classe";

        this.classe = classe;
        this.name = name;
        this.extend = extend;

        this.numRegion = numRegion;
    }

    // --> class : class , nom , extends , (listParam (qui sont déjà dans la TDS de la classe))
    public String getNature() {
        return this.nature;
    }

    public String getName() {
        return this.name;
    }

    public String getExtend() {return this.extend;}

    public int getNumRegion() {
        return this.numRegion;
    }

    public int getDeplacement() {
        return this.deplacement;
    }

    public String getType() {
        return this.type;
    }

    public void afficherElement() {
        switch (nature) {
            case "paramAttr" :
                if(isStatic) {
                    System.out.println("static type : " + type + "    nom : " + name + "    offset : " + deplacement);
                } else {
                    System.out.println("type : " + type + "    nom : " + name + "    offset : " + deplacement);
                }
                break;

            case "boucle":
                if (numImb[1] == 0) {
                    System.out.println("WHILE_BLOC : " + numReg[0] + "." + numImb[0]);
                } else {
                    System.out.println("IF_BLOC :    THEN : " + numReg[0] + "." + numImb[0] + "    ELSE : " + numReg[1] + "." + numImb[1]);
                }
                break;

            case "pere":
                System.out.println("PERE : " + numRegPere + "." + numImbPere);
                break;

            case "methode":
                if (isStatic) {
                    if (isOverride) {
                        System.out.println("static override methode : " + name + "    typeRetour : " + type + "   numRégion : " + numRegion);
                    } else {
                        System.out.println("static methode : " + name + "    typeRetour : " + type + "   numRégion : " + numRegion);
                    }
                } else if (isOverride) {
                    System.out.println("override methode : " + name + "    typeRetour : " + type + "   numRégion : " + numRegion);
                } else {
                    System.out.println("methode : " + name + "    typeRetour : " + type + "   numRégion : " + numRegion);
                }
                break;

            case "classe":
                if (classe) {
                    if (!this.extend.equals("")) {
                        System.out.println("class : " + name + "    extends : " + extend + "    numRégion : " + numRegion);
                    } else {
                        if (name.equals("MAIN")) {
                            System.out.println("numRégion du main : " + numRegion);
                        } else {
                            System.out.println("class : " + name + "    numRégion : " + numRegion);
                        }
                    }

                } else {
                    if (!this.extend.equals("")) {
                        System.out.println("constructeur : " + name + "    extends : " + extend + "    numRégion : " + numRegion);
                    } else {
                        System.out.println("constructeur : " + name + "    numRégion : " + numRegion);
                    }
                }
                break;

            default :
                System.out.println("Le type de l'élément n'existe pas");
        }
    }

    public int[] getNumImb() {
        return numImb;
    }

    public int[] getNumReg() {
        return numReg;
    }

    public Boolean getClasse() {
        return classe;
    }

    public Boolean getIsStatic() { return isStatic;}
}
