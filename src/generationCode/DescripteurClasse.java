package generationCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static java.lang.Math.max;

public class DescripteurClasse {

    // ------------------------------------ ATTRIBUTS ------------------------------------- //

    private int tailleObj = 0;
    private int nbMethode = 0;

    private static int deplacementMax = 2;
    private LinkedHashMap<String, Integer> listMethodes;

    // ----------------------------------- CONSTRUCTEUR ----------------------------------- //

    public DescripteurClasse() {
        listMethodes = new LinkedHashMap<>();
    }

    // ------------------------------ METHODES DE LA CLASSE ------------------------------- //

    public void ajoutMethode(String nomMethode) {
        deplacementMax += 2;
        listMethodes.put(nomMethode, deplacementMax);

        this.nbMethode++;
    }

    public void updateTailleObj(int aRajouter) {
        this.tailleObj += aRajouter;
    }

    // -------------------------------------- GETTERS ------------------------------------- //

    public int getTailleObj() {
        return this.tailleObj;
    }

    public int getNbMethode() {
        return this.nbMethode;
    }

    public LinkedHashMap getListMethode() {
        return this.listMethodes;
    }

    public int getDeplacementMethode(String nomMethode) {
        return this.listMethodes.get(nomMethode);
    }

    // -------------------------------------- SETTERS ------------------------------------- //
    //Pour l'instant il n'y a pas de setters

    public void setTailleObj(int taille) {
        this.tailleObj = taille;
    }

    // ------------------------------------- AFFICHAGE ------------------------------------ //

    public void afficherDescipteur() {
        System.out.println("TAILE D'UN OBJET :\t" + this.tailleObj + "\n"
                    + "NOMBRE DE METHODES :\t" + this.nbMethode + "\n");

        for (String nomMethode : listMethodes.keySet()) {
            System.out.println("Methode : " + nomMethode + " Deplacement : " + listMethodes.get(nomMethode));
        }

        System.out.println("\n\n");
    }
}
