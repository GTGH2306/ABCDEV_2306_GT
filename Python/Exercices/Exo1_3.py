#coding:utf-8
import math

rayon = float(input("Entrez le rayon du cercle : "))
angle = float(input("Entrez l'angle du secteur : "))
aire = round(((math.pi * rayon**2 * angle) / 360) * 1000 ) / 1000
print("L'aire du secteur est de:", aire)