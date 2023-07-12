#coding:utf-8
import math

rayon = float(input("Entrez le rayon de la sphère :"))
aire = 4 * math.pi * rayon**2
aire = round(aire * 1000) / 1000
print("L'aire de la sphère est de", aire)
volume = (4/3) * math.pi * rayon**3
volume = round(volume * 1000) / 1000
print("Le volume de la sphère est de", volume)