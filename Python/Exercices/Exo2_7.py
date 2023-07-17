#coding:utf-8

quitter = False
virgule = False
valide = True

while not quitter:
    saisie = str(input("Saisissez un nombre entre 0.01 et 1000000 à convertir ou Q pour quitter:\n"))
    valide = True
    virgule = False

    if saisie == "Q" or saisie == "q":
        quitter = True
    if not quitter:
        for element in saisie:
            if element == "." and not virgule:
                virgule = True
            elif element.isdigit():
                pass
            else:
                valide = False

        if valide:
            km = float(saisie)
            if km < 0.01:
                print("Nombre invalide, trop petit.")
            elif km > 10000000:
                print("Nombre invalide, trop grand.")
            else:
                mi = round((km/1.609) * 100) / 100
                print(km,"km donne", mi,"miles.")
        else:
            print("Nombre invalide, pas un vrai nombre.")


