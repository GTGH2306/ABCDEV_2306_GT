#coding:utf-8
import random

obj = random.randint(0, 100)
resolu = False
bas = 0
haut = 100
essai = 1

while not resolu:
    print("Devinez le nombre entre", bas, "et", haut,": ")
    saisie = int(input())
    if saisie > obj:
        print("Trop haut.")
        if saisie < haut:
            haut = saisie
        essai += 1
    elif saisie < obj:
        print("Trop bas.")
        if saisie > bas:
            bas = saisie
        essai += 1
    else:
        resolu = True
        print("Bravo! Vous avez trouvé en", essai,"essai(s).\nLe nombre était bien", obj, ".")