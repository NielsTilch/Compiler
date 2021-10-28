/* Les paramètres précedés de var définissent implicitement des attributs */

class Point(var x: Integer, var y: Integer, var name: String) is
{
    var static next : Integer := 0; /* compteur d'instance */
    def static howMany() : Integer := this.next -1 /* nbre d'instances crées */

    var hasClone : Integer := 0;

    /* la valeur du champ ce-dessous est indéfinie si hasClone vaut 0. Le problème est qu'on n'a pas l'équivalent de NULL (du bon type) dans le langage. */
    var clone : Point;

    /* L'en-tête du constructeur doit être identique à celui de la classe.Les paramètres précédés de var correspondent implicitement à des attributs de même nom qui seront initialisés automatiquement à la valeur du paramètre, comme si on avait la ligne suivante en tête du constructeur : this.x := x; this.y := y; this.name :=name; */

    def Point(var x: Integer, var y: Integer, var name: String) is { this.next := this.next +1; }

    def setName(s: String) is {this.name := s;}

    def getx() : Integer := this.x   /* pas de this implicite */
    def gety() : Integer := this.y
    def sCloned() : Integer := this.hasClone <> 0

    def move(dx: Integer, dy: Integer, verbose: Integer) : Point is {
        this.x := this.x + dx; this.y := this.y +dy;
        if verbose then { this.print(verbose); } else {}

        /* pseudo variable 'result' dans laquelle, par convention, on laisse la valeur de retour d'une fonction qui a un type de retour. */

        result := this;
    }

    def print(verbose : Integer) is {
        if verbose then "Inside Point::print".println(); else{ }
        /* Exemples avec l'opérateur & de concatenation de chaines */
        this.name.print();
        ("= {" & this.x.toString() & ", " & this.y.toString() & ")" ).println();
    }

    /* par defaut, on ajoute un ' au nom de l'objet. On pourra le changer apres coup avec setName si on veut */

    def clone() : Point is
    {
        /* On mémorise le dernier clone construit à partit de cet objet si on voulait on pourrait aller le chainer à la fin de la liste des clones */
        this.clone := new Point(this.x, this.y, this.name & " ");
        this.hasClone := 1;
        result := this.clone;
    }

    /* imprime un objet et ses clones, s'ils existent */
    def allClones () is {
        this.print(0);
        if this.isCloned() then { this.clone.allClones(); } else { }
    }

    def egal(p: Point) : Integer is {
        /* Ils sont égaux s'ils ont memes coordonnées. On n'a pas de booleen donc on se sert des entiers, comme en C. */

        b1 : Integer := p.getx() - this.x;
        b2 : Integer := p.gety() - this.y;

        is

        if b1 then result := 0;
        else result := b2 = 0;
    }
}


class Couleur(var coul: Integer) is {
    /* 3 couleurs codées par 0, 1 ou 2 */


    def Couleur (var coul: Integer) is {
        if coul < 0 then coul := 0;
        else {}
        if coul > 2 then coul := 0;
        else {}
        this.coul := coul;
    }

    def name(verbose: Integer) : String is {
        aux : String := "Blanc";
        if verbose then "Inside Couleur::couleur".println();
        else {}
        if this.coul = 0 then { result := aux; }
        else { /* exemple avec 2 blocs emboités qui chacun déclare une variable. Ici le aux externe doit etre masqué. */
            aux : String := "Gris";
            if this.coul = 1 then aux := "Noir";
            else result := aux;
        }
    }

    def estGris() : Integer is {
        "Inside Couleur::estGris".println();
        result := this.coul = 2;
    }
}


/* simule une classe avec des attributs et des méthodes statiques puisqu'il y aura toujours une seule instance (implicite) de l'objet */

class CouleurFactory() is
{ var static theBlanc: Couleur := new Couleur(0);
  var static theNoir : Couleur := new Couleur(1);
  var static theGris : Couleur := new Couleur(2);

  def CouleurFactory () is {}

  def static blanc() : Couleur := this.theBlanc
  def static noir() : Couleur := this.theNoir
  def static gris() : Couleur := this.theGris
}

/* Ci-dessous on ne met pas de "var" devant x et y sinon ça definirait 2 nouveaux champs qui masqueraient ceux hérités de Point. On va fournir une valeur par défaut pour le paramètre "name" du constructeur de Point, donc on n'a pas besoin de demander sa valeur ici. */

class PointColore(x: Integer, y: Integer, var_coul: Couleur) extends Points is {

    def PointColore(x: Integer, y: Integer, var_coul: Couleur) : Point(x, y, "P-" & cptPoint.howMany().toString() ) is {}

    def couleur() : Couleur := this.coul

    def colore() : Integer := this.coul.estGris() <> 0

    /* statiquement on renvoie un Point (pas un PointColore : pas de covariance)
    mais dynamiquement on cree bien une instance de PointColore */

    def override clone() : Point is {
        /*ci-dessous x et y sont les champs hérités de Points.
        Helas on ne peut pas juste faire super.clone() car cela creerait une instance de Point pas de PointColore
        */

        result := new PointColore(this.x, this.y, this.coul);
        results.setName(this.name & "'");
        this.clone := result;
    }

    def estGris() : Integer := this.coul.estGris()

    /* exemple de méthode redéfinie */
    def override print(verbose : Integer) is {
        if verbose then "Inside PointColore::print".println();
        else {}
        super.print(verbose);
        this.couleur().name(verbose).println();
    }
}


class PointNoir (xc: Integer, yc: Integer) extends PointColore is {
    def PointNoir(xc: Integer, yc: Integer) : PointColore(xc, yc, CouleurFactory.noir()) is {/* vide */}

    /* autres exemples de méthodes redéfinies */
    def override estGris() : Integer := 0 /*false*/
    def override colore() : Integer := 1 /*true*/
    def override couleur() : Couleur := CouleurFactory.noir()
}


/*Parenthèses obligatoires*/
class DefaultPoint() extends PointColore is {
    def DefaultPoint() : PointColore(0, 0, CouleurFactory.blanc()) is {}

    def override estGris() :Integer := 0
    def override couleur() : Couleur := CouleurFactory.blanc()
}


class Test() is {
    def Test() is {}

    def static test(p : Point, p2: PointColore, p3: PointNoir) is {
        c: String; c2: String; c3: String;
        true: Integer := 1;
        false: Integer := 0;

        is
        p.print(true);
        p2.print("true");
        if p.colore() <> 0 then c := "colore"; else c := "gris";
        if p2.colore() <> 0 then c2 := "colore"; else c2 := "gris";
        if p3.colore() <> 0 then c3 := "colore"; else c3 := "gris";

        "Resultats de test: ".println();
        c.print(); " ".print();
        c2.print(); " ".print();
        c3.print();
        "".println(); /*imprime une ligne vide*/
    }

    def static test2(p: PointColore) is {
        p.couleur().name(0).print();
    }
}

/* des exemples ad-hoc qui montre d'autres aspects... */

class A() is {
    var v: Integer;

    def A() is { this.v := 1; }
    def f() is { "A::f(à\n".print(); }
    def h(x: Integer, y: Integer) : Integer := x + y
}

class A2() extends A is {
    var v : String; /* masque le champ v de la classe A*/

    def A2() : A() is { this.v = "hello"; }

    def override f() is { "A2::f()\n".print(); }
    def g() is {
        this.v = "world"; /* par defaut, il s'agit du champ de A2 */

        (as A : this).v := 1; /*this etant caste en A, le champ v en question est celui de A*/

        this.f();
        (as A : this).f();  /* les deux appels doivent fournir le même résultat*/
    }
    def override h(x: Integer, y: Integer) : Integer := super.h(x, y)
}


{ /* bloc qui correspond au programme principal */

    true: Integer := 1;
    p1: Point := new Point (1, 5, "p1");
    p2: Point := new Point (2, 3, "p2");
    p3: Point := new Point (0, 0, "p3");

    o: PointColore := new PointColore(50, 100, CouleurFactory.noir());
    o2: Point;

    pn: PointNoir := new PointNoir(+1, -1);
    dp: DefaultPoint := new DefaultPoint();

is

    p2.move(p1.getx(), p1.gety(), true);
    o.setName("origine");
    p2.move(p1.getx()-2*5-3, p1.gety(), true);
    o.print(true);
    p2.print(true);

    "\nClonage de o:".println();
    o2 := o.clone();
    o2.print(true);

    /* on clone le colonne et on le déplace */
    o2.clone.move(54, 36, 0).print(true);
    "\nListe des clones de o:".println();
    o.allClones();
    "\nFin de la liste\n".println();

    /* Ne doit pas compiler car clone renvoie statiquement un Point alors
    que o est déclaré comme PointColore,
    que o := o.clone();
    */

    "Seconde liste de clones de o:".println();
    o2 := p1.clone();
    o2.move(+2, -3, 0);
    p1.print(0); /* les coordonnées ne sont pas modifiées */
    o2.clone();
    p1.allClones();
    "\nFin de la seconde liste\n".println();

    "test(Point, PointColore, PointNoir)".println();
    Test.test(p1, o, pn);

    "test(PointNoir, PointNoir, PointNoir)".println();
    Test.test(pn, pn, pn);
    p1 := pn; /* affectation entre pointeurs */
    Test.test2(o);
    Test.test2(pn);
    o := pn; /* Idem on doit avoir de la liaison dynamique ci dessous */

    "test(PointNoir, PointNoir, PointNoir)".println();
    Test.test(p1, o, pn);
    Test.test2(o);
    Test.test2(pn);
    "\nDone".println();
}
