#coding:utf-8

a = int(input("Saisir valeur A : "))
b = int(input("Saisir valeur B : "))
print("Votre valeur A est", a, "et votre valeur B est", b)
temp = a
a = b
b = temp
print("Votre valeur A est maintenant", a, "et votre valeur B est maintenant", b)