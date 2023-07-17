#coding:utf-8

nbr = int(input("Saisissez un nombre : "))
i = 2

while i < nbr:
    if nbr % i == 0:
        print(nbr, "est divisible par", i)
    i += 1
print("Fin du programme")