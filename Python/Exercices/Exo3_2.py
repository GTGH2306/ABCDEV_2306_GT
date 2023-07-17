#coding:utf-8

argent = float(input("Saisissez l'argent dont dispose Barnabé: "))
magasin = int(0)
while argent > 0:
    if (argent / 2) + 1 > 0:
        argent -= (argent/2) + 1
        magasin += 1
    else:
        argent = 0
        magasin += 1
print("Barnabé a pu allé dans", magasin, "magasin(s).")