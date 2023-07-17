#coding:utf-8

nbra = int(input("Saisissez A : "))
nbrb = int(input("Saisissez B : "))
nbrc = int(input("Saisissez C : "))

if nbra <= nbrb and nbra <= nbrc:
    if nbrb <= nbrc:
        print(nbra, "<=", nbrb, "<=", nbrc)
    else:
        print(nbra, "<=", nbrc, "<=", nbrb)
elif nbrb <= nbra and nbrb <= nbrc:
    if nbra <= nbrc:
        print(nbrb, "<=", nbra, "<=", nbrc)
    else:
        print(nbrb, "<=", nbrc, "<=", nbra)
else:
    if nbrb <= nbra:
        print(nbrc, "<=", nbrb, "<=", nbra)
    else:
        print(nbrc, "<=", nbra, "<=", nbrb)
