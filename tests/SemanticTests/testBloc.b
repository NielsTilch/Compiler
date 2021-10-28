class UneClasseDInstanciation() is {
    def UneClasseDInstanciation() is {}
}


class UneClasseDErreur() is
{
    def UneClasseDErreur() is {}

    /* Gestion du is */

    /*Ceci est juste*/
    def noIs() is {}

    def goodIs() is {
    unNombre : Integer;
    is
    unNombre := 3;
    }

    /*Ceci est faux*/
    def erreurIs() is {
    is
    unNombre : Integer;
    unString : String := "ça ne marche pas";
    uneInstance : UneClasseDInstanciation := new UneClasseDInstanciation();
    is
    }

    def erreurIsImbriquee() is {
        if true then {
            unString : String := "ça ne marche pas";
            is
            unNombre : Integer;
        } else {
            unString : String := "ça ne marche pas";
            is
            unNombre : Integer;

        }

        while (true) do {
            unString : String := "ça ne marche pas";
            is
            unNombre : Integer;
        }

        {
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
}

{ /* programme principal*/
is
result;

if true then {result;} else {result;}

while (true) do {result;}

{result;}
}
