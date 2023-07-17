#coding:utf-8

"""
Nommer une variable :
doit commencer par une lettre ou underscore (_)
ne pas conterir de caractères spéciaux
ne pas contenir d'espaces
utiliser des underscores (_)    

Types standards:
entier numérique (int)
nombre flottant (float)
chaîne de caractères (str)
booléen (bool) (avec majuscule a True ou False)
(Le typage est automatique en Python)
"""

age_personne = input("Entrez votre âge : ")
age_personne = int(age_personne)
continuer_partie = True
nom_personne = input("Entrez votre nom : ")
prix_ht = 120.85

print(type(age_personne))
print(type(nom_personne))
print(type(continuer_partie))
print(type(prix_ht))

print("Nom:", nom_personne, "\nÂge:", age_personne, "\nPrix:", prix_ht, "\nContinuer?", continuer_partie)

texte = "Le nom de la personne est {} et son âge est de {} ans."
print(texte.format(nom_personne, age_personne))