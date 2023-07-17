#coding:utf-8

nbr = int(input("Saisissez un nombre : "))
x = 2
premier = True

while x < nbr and premier:
    if nbr % x == 0:
        premier = False
    x += 1

if premier:
    print(nbr, "est un nombre premier.")
else:
    print(nbr, "n'est pas premier.")