package Blackjack;

import java.util.Scanner;

public class Tirage {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		String cardtemp;
		
		while (total < 100) {
			cardtemp= Tirage.tire();
			System.out.println("Vous tirez un " + cardtemp);
			
			total += Tirage.valeur(cardtemp, scanner);
			
			System.out.println("Votre total devient " + total);
		}
		
		scanner.close();
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
	public static int valeur(String carte, Scanner sc) {
		int valeur = 0;
		String saisie;
		
		switch(carte) {
		case "Roi", "Dame", "Valet", "10":
			valeur = 10;
			break;
		case "2", "3", "4", "5", "6", "7", "8", "9":
			valeur = Integer.parseInt(carte);
			break;
		default :
			boolean valide;
			do {
				System.out.println("L'As vaut 1 ou 11 ?");
				saisie = sc.nextLine();
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
		return valeur;
	}
	
	public static int valeurAuto(String carte, int total) {
		int valeur = 0;
		
		switch(carte) {
		case "Roi", "Dame", "Valet", "10":
			valeur = 10;
			break;
		case "2", "3", "4", "5", "6", "7", "8", "9":
			valeur = Integer.parseInt(carte);
			break;
		default :
			if (total + 11 < 22) {
				valeur = 11;
				System.out.println("Cet As vaut 11.");
			} else {
				valeur = 1;
				System.out.println("Cet As vaut 1.");
			}
			break;
		}
		return valeur;
	}
}
