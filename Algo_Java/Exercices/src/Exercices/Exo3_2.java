package Exercices;

import java.util.Scanner;

public class Exo3_2 {

	public static void main(String[] args) {
		/*
		 VARIABLES
		 Somme : Entier
		 NbrMagasin : Entier
		 
		 Debut programme
		 	NbrMagasin <-- 0
		 	Ecrire "Saisissez la somme dont Barnabé dispose :"
		 	Lire <-- Somme
		 	Tant que Somme > 0
		 		Si ((Somme/2)+1 > 1)
		 			Somme <-- (Somme - ((Somme/2) + 1))
		 		Sinon
		 			Somme <-- 0
		 		Fin Si
		 		NbrMagasin <-- NbrMagasin + 1
		 	Fin Tant que
		 	Ecrire "Barnabé est allé dans ", NbrMagasin, " magasins.
		 Fin programme
		 */
		
		int somme;
		int nbr_magasin = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez la somme dont dispose barnabe :");
		somme = sc.nextInt();
		
		while (somme > 0) {
			if (somme > ((somme/2) + 1)) {
				somme -= (somme/2) + 1;
			} else {
				somme = 0;
			}
			nbr_magasin ++;
			System.out.println("Il reste " + somme +" euro(s) a barnabe.");
		}
		System.out.println("Barnabe a pu alle dans " + nbr_magasin +" magasins.");
		sc.close();
	}

}
