class TesteurMath (var a: Integer, var b: Integer, var c: Integer) is
{

var static nbPassagedeclasse : Integer := 0;
var x : Integer;
var y : Integer;
var z : Integer;


def TesteurMath (var a: Integer, var b: Integer, var c: Integer) is {
    x := a;
    y := b;
    z := c;
}

 /* compteur d'instance */
def static howMany() : Integer := this.nbPassagedeclasse -1

/*Donne en retour 0 si x,y et z est un triplet pythagoricien sinon 1*/
def tripletPythagore() : Integer is {
    resultat : Integer;

    is

    if ((x*x + y*y) = z*z) then {
        resultat := 0;
    }else{
        resultat := 1;
    }
    result := resultat;

}

}

{
testeur1 : TesteurMath := new TesteurMath(3,4,5);
testeur2 : TesteurMath := new TesteurMath(3,4,6);

resultat1:Integer;
resultat2 : Integer;

unString : String;
deuxString : String;
troisString : String;


is

resultat1 := testeur1.tripletPythagore();
resultat2 := testeur2.tripletPythagore();

if (resultat1 = 0) then {
    "Trinome pythagore".println();
}else{
    "Pas trinome".println();
}

if (resultat2 = 0) then {
    "Trinome pythagore".println();
}else{
    "Pas trinome".println();
}

unString := "date";
deuxString := ":ajd";
troisString := unString & deuxString;
troisString.println();

}