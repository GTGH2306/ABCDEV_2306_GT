package Blackjack;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int argent = 100;
		int valeur_j;
		int valeur_c;
		int mise;
		String saisie;
		String tempcard;
		boolean quitter = false;
		boolean busted;
		boolean valide;
		
		while (!quitter) {
			busted = false;
			valeur_j = 0;
			valeur_c = 0;
			mise = 0;
			
			
			do { //Verifie si saisie est un nombre ou si le joueur quitte
				System.out.println("Vous avez " + argent + " euros.\nCombien voulez-vous miser ?");
				saisie = sc.next();
				if (saisie.equals("q") || saisie.equals("Q")) {
					quitter = true;
					valide = true;
				} else if (!Valide.isInt(saisie)){
					System.out.println("Saisie invalide, merci de saisir un entier ou Q pour quitter.");
					valide = false;
				} else {
					valide = true;
				}
				
				
				if (valide) { //Verifie que le joueur peux parier cette somme
					mise = Integer.parseInt(saisie);
					if (mise > argent) {
						valide = false;
						System.out.println("Vous n'avez pas autant d'argent !");
					} else if (mise < 1) {
						valide = false;
						System.out.println("Vous devez miser au moins 1 euro.");
					} else {
						valide = true;
					}
				}
				
				
				
				
			} while (!valide);
		}
		sc.close();
	}

}
