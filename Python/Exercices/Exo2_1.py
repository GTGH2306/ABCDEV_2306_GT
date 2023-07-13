#coding:utf-8

age = int(input("Saisissez votre âge : "))
if age < 0:
    print("Vous n'êtes pas né.")
elif age <18:
    print("Vous êtes mineur.")
else:
    print("Vous êtes majeur.")