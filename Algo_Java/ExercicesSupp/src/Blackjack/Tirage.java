package Blackjack;

import java.util.Scanner;

public class Tirage {
	public static void main(String[] args) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println(Tirage.tire());
		}
		
		
		
	}
	
	
	public static String tire() {
		String carte;
		int index = (int)(Math.random() * 13) + 1;
		
		switch (index) {
		
		case 2,3,4,5,6,7,8,9,10 :
			carte = Integer.toString(index);
			break;
		case 11:
			carte = "Valet";
			break;
		case 12:
			carte = "Dame";
			break;
		case 13 :
			carte = "Roi";
			break;
		default:
			carte = "As";
			break;
		}
		
		return carte;
	}
	public static int valeur(String carte) {
		Scanner sc = new Scanner(System.in);
		int valeur = 0;
		String saisie;
		
		switch(carte) {
		case "Roi", "Dame", "Valet", "10":
			valeur = 10;
			break;
		case "2", "3", "4", "5", "6", "7", "8", "9":
			valeur = Integer.parseInt(carte);
			break;
		default:
			boolean valide;
			do {
				System.out.println("L'As vaut 1 ou 11 ?");
				saisie = sc.next();
				if (saisie.equals("1")) {
					valeur = 1;
					valide = true;
				} else if (saisie.equals("11")) {
					valeur = 11;
					valide = true;
				} else {
					System.out.println("Saisie invalide.");
					valide = false;
				}
			} while (!valide);
			break;
		}
		sc.close();
		return valeur;
	}
}
