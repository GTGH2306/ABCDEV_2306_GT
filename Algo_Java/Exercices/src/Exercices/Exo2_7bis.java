package Exercices;

import java.util.Scanner;

public class Exo2_7bis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean quitter = false;
		boolean invalide = false;
		boolean virgule;
		Double km;
		Double mi;
		
		while (invalide || !quitter) { //Tant que la saisie est invalide ou que l'utilisateur n'as pas quitter, le code s'execute.
			System.out.println("Saisissez un nombre en km a convertir entre 0.01 et 1000000 ou saisissez Q pour quitter");
			String saisie = sc.next();
			virgule = false; //Réinitialisation de s'il y'a une virgule car nouvelle entrée
			invalide = false; //Réinitialisation de si c'est valide car nouvelle entrée
			
			if (saisie.equals("q") ||saisie.equals("Q")) { //Verifie si l'utilisateur a saisi qu'il voulais quitter
				quitter = true;
				invalide = false; // S'il quitte, je met que la saisie valide pour pouvoir sortir de la boucle 
			} else {
				quitter = false;
			}
			
			if (!quitter) { //Si l'utilisateur n'as pas quitter, il faut vérifier que le nombre entré est valide
				for (int i = 0 ; i != saisie.length() ; i++) { //Vérifie chaque caractère de la saisie
					if (Character.isDigit(saisie.charAt(i)) == false) { //Si c'est autre chose qu'un nombre
						if ((saisie.charAt(i) == '.') && !virgule){ //Verifie si c'est une virgule, et la seule
							virgule = true; //S'il n'y avais pas encore de virgule identifiée, on indique qu'il y'en a une
						} else {
							invalide = true; //Sinon, c'est que le nombre a, soit 2 virgule, soit un caractère autre qu'une virgule
						}
					}
				}
				if (!invalide) { //Maintenant qu'on sait que le String est un nombre, on peux le convertir
					km = Double.parseDouble(saisie);
					if (km < 0.01) { //Si nombre trop petit
						System.out.println("Saisie invalide! (Nombre trop petit)");
						invalide = true;
					} else if (km > 1000000) { //Si nombre trop grand
						System.out.println("Saisie invalide! (Nombre trop grand)");
						invalide = true;
					} else {	//Sinon c'est que le nombre est valide
						mi = km * 0.621371d;
						mi = Math.round(mi * 100) / 100d;
						System.out.println(saisie + "km donne " + mi + " miles");
					}
				} else { //Le nombre est invalide car il n'as pas réussi la verif' de si c'est bien un vrai nombre
					System.out.println("Saisie invalide! (Nombre invalide)");
				}
				
			}
		}
		sc.close();
		
	}

}
