package Exercices;
import java.util.Scanner;
import java.lang.Math;

public class Exo2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Saisissez un nombre en Km entre 0.01 et 1 000 000 ou q pour quitter:");
		String saisie = sc.next();
		double mi;
		double km = 0;
		boolean quitter = false;
		boolean invalide = false;
		boolean virgule = false;
		
		do {
			if (invalide) {
				System.out.println("Saisie invalide.");
				System.out.println("Saisissez un nombre en Km entre 0.01 et 1 000 000 ou q pour quitter:");
				saisie = sc.next();
				virgule = false;
				invalide = false;
			}
			if (saisie.equals("q")) {
				quitter = true;
			} else {
				for (int i = 0 ; i != saisie.length() ; i++) {
					if (Character.isDigit(saisie.charAt(i)) == false) {
						if ((saisie.charAt(i) == '.') == true && virgule == false){
							virgule = true;
						} else {
							invalide = true;
						}
					}
				}
			}
			if (!invalide && !quitter) {
				km = Double.parseDouble(saisie);
				if (km < 0.01 || km > 1000000) {
					invalide = true;
				}
			}
		} while (invalide);
		if (!quitter) {
			mi = km * 1.609;
			mi = Math.round(mi * 100) / 100d;
			System.out.println(km + " Km correspond a " + mi + " miles.");
				}
		sc.close();
		System.out.println("Fin du programme.");
	}
}
