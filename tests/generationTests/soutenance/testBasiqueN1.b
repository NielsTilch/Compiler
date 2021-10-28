{
a : Integer := -1;
b : Integer;

is

b := 2*3+4; /*b = 10 ou 000a*/


if (b = 10) then { /*on rentre dans le then ici*/
    b := b - 2; /*b = 8*/
} else {
    b := 4;
}

if (b <> 8) then { /*on rentre dans le else là*/
    b := 4;
} else {
    a := b - 6; /*a = 2*/
}

while(a<>2) do { /*on rentre pas dans la boucle*/
    a := 27;
}

while(a<>0) do { /*on rentre dans la boucle pour 2 tours*/
    a:= a-1;

}



}