#coding:utf-8

somme = float(input("Entrez la somme placée : "))
annees = int(input("Entrez la nombre d'années de placement : "))
interet = float(input("Entrez le taux d'intéret en pourcents : "))
interet /= 100
resultat = round(somme * (1 + interet * annees) * 100) / 100
print("La somme gagnée serait de", resultat, "pour un taux d'interet simple.")
resultat = round((somme * (1 + interet)**annees) * 100) / 100
print("La somme gagnée serait de", resultat, "pour un taux d'interet composé.")