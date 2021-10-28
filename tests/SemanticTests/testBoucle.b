{

    /* boucle while vide : ne peut pas passer car il n'y a pas de conditions sur le while
    while () do {}*/


    /* boucle while avec bloc vide (1 expression)
    while (expression) do {}*/


    /* boucle if avec des blocs vides */
    if true then {} else {}


	/* boucle if simple*/
	if verite = true then {
		"true".println();
	}
	else {}


	/*Test d'une boucle while simple*/
	while(n<2) do {
		NomClasse.methode();
		nomMethode.methode(a);
	}


	/*Programme test d'une boucle while et if imbriquées*/
	while(i<10) do {
		if j = 12 then {
		}
		else {
		}
	}

	/*Test de boucles if imbriquées*/
	if n <> 20 then {
		if n>10 then {
			"a".println();
		}
		else {
			"b".println();
		}
	}
	else {}

	/*Test boucle while imbriquée dans boucle if*/
	if j = 12 then {
		while(n<2) do {}
	}
	else {}

/* Test boucle else if */
	if j = 12 then {
		while(n<2) do {}
	}
	else
		if true then{}
		else return;


	/*Test d'une boucle if sans else : ne devrait pas passer
	if n=2 then {
		"ce test ne devrait pas passer".println();
	}*/
}
{}
