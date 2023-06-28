package Exercices;
import java.lang.Math;
import java.util.Scanner;

public class JusteChiffre {
	public static void main (String args[]) {
		long nombrelong = Math.round(Math.random() * 1000);
		int nombreint = (int)nombrelong;
		int essai;
		boolean trouve = false;
		boolean perdu = false;
		int compteur = 0;
		int essaimax = 12;
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("Vous devez deviner au nombre auquel je pense entre 0 et 1000.");
		System.out.println("Vous avez jusque " + essaimax + " essais.");
		
		while (trouve == false && perdu == false) {
			
			essai = scanner.nextInt();
			if (essai > nombreint) {
				compteur += 1;
				if (compteur < essaimax) {
					System.out.println("C'est moins !");				
				}
			} else if (essai < nombreint) {
				compteur += 1;
				if (compteur < essaimax) {
					System.out.println("C'est plus !");				
				}

			} else if (essai == nombreint) {
				System.out.println("Vous avez trouve ! Le nombre etait bien " + nombreint + " !");
				System.out.println("Vous avez trouve en " + (compteur + 1) + " essai(s).");
				trouve = true;
			}
			if (compteur >= essaimax) {
				perdu = true;
			}
		}
		if (perdu == true) {
			System.out.println("Oh non! Vous n'avez pas trouve en " + essaimax + " essais, c'est perdu!");
			System.out.println("Le nombre etait " + nombreint + " .");
		}
		
		
		scanner.close();
	}

}
