#coding:utf-8

nbra = int(input("Saisissez A : "))
nbrb = int(input("Saisissez B : "))

if nbra < nbrb:
    print(nbra, "<", nbrb)
elif nbrb < nbra:
    print(nbrb, "<", nbra)
else:
    print(nbra, "=", nbrb)