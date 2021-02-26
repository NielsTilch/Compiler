class UneClasseDInstanciation() is {
    def UneClasseDInstanciation() is {}
}

class UneClasseDInstanciation() is {
    def UneClasseDInstanciation() is {}
}

class UneClasseDErreur() is
{
    var pasDeType : PasDeType;

    def UneClasseDErreur() is {}

            /*Gestion des blocs*/

    /* Gestion du is */

    /*Ceci est faux*/
    def erreurIs() is {
    is
    unNombre : Integer;
    unString : String := "ça ne marche pas";
    uneInstance : UneClasseDInstanciation := new UneClasseDInstanciation();
    is
    }

    def erreurIsImbriquee() is {
        while (true) do {
            unString : String := "ça ne marche pas";
            is
            unNombre : Integer;
        }
    }

    /*Gestion du result*/

    /*Ceci est juste*/
    def methTypeAvecBloc() : Integer is {result;}

    def methTypeSansBloc() : String := "ceci fonctionne"

    def methSansTypeAvecBloc() is {}

    /*Ceci est faux*/
    def methFausseTypeAvecBloc() : Integer is {}

    def methFausseSansType() is {result;}

    def methFauseSansTypeAvecBlocIf() is {
        if (0=0) then {result;} else {result;}
    }

    def methFausseSansTypeAvecBlocWhile() is {
        while (true) do {result;}
    }

            /*Gestion des méthodes*/
    def methDefinie() is {}

    def methDefinie() is {} /*Redéfinition de méthode*/

    def override methOverride() is {}

    def methParamDouble (unParam : Integer, unParam : String) is {}

    var unAttribut : Integer;

    def methParamAttrib (unAttribut : String) is {}

    def methTypeRetourInexistant() : TypeRetourInexistant := 3

    def methParamMauvaisType(paramPasDeType : PasDeType) is {}
}

class UneClasseAHeriter(unParamAHeriter : String) is {
    def UneClasseAHeriter(unParamAHeriter : String) is {}

    def methAOverride() is {}
}

class UneClasseHeritante() extends UneClasseAHeriter is {
    def UneClasseHeritante() is {}

    def override methOverrideInconnue() is {}

    def methAOverride() is {}
}

class UneAutreHeritiere() extends UneClasseAHeriter is {
    def UneAutreHeritiere() : TEsPasMaMere() is {}
}

class UneClasse() is {
    def UneAutreClasse(unParam : Integer) is {}
}

class UneClasseAvecParamVar( var unParamVar : Integer, unParamSansVar : Integer) is {
    def UneClasseAvecParamVar(unParamVar : Integer, var unParamSansVar : String) is {}
}


class HeritageA() extends HeritageB is {
    def HeritageA() : HeritageB() is {}
}

class HeritageB() extends HeritageA is {
    def HeritageB() : HeritageA() is {}
}

{ /* programme principal*/

                /*Fonctionnement de bloc*/
unNombre : Integer;
unNombre : Integer;
pasDeType : PasDeType;
ceNEstPasUnInteger : Integer := "c'est un texte";

uneVariableCast : UneClasseDErreur;

uneVariableCastTest : UneClasseDInstanciation :=(as UneClasseDInstanciation : uneVariableCast);

uneVariableCastTest2 :  UneClasseDInstanciation :=(as UneClasseDInstanciation : uneExpressionNonDeclarree);

is
{result;}

                /*Les opérations*/
/*ceux qui ne passent pas :*/
2/0; /*division par 0 simple*/
1+(2*1+2/0); /*division par 0 imbriquée*/
1&1; /*avec &, il faut des strings*/
nonDefini+1; /*Erreur de typage + variable non définie*/
1+"pomme"; /*erreur de typage simple*/
"pomme" + "orange"; /*les membres gauche et droite de l'opération + doivent être des int*/

this.oui := "oui";

unNombre := new UneClasseDErreur();


unNombre := "un string";

}
