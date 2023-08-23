package exerciceBouteille;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String saisie;
		Scanner sc = new Scanner(System.in);
		Bouteille bottle = new Bouteille();
		do {
			System.out.println("Bouteille pleine à " + bottle.getPourcentagePlein() + " %");
			if(bottle.getOuverte()) {
				System.out.println("La bouteille est ouverte.");
			} else {
				System.out.println("La bouteille est fermée.");
			}
			System.out.println("(o pour ouvrir)\t\t(f pour fermer)\n(r pour remplir)\t(v pour vider)");
			saisie = sc.next();
			switch (saisie) {
				case "o":
					bottle.ouvrir();
					break;
				case "f":
					bottle.fermer();
					break;
				case "r":
					System.out.println("Saisissez le pourcentage d'eau duquel vous remplissez la bouteille:");
					bottle.remplir(sc.nextDouble());
					break;
				case "v":
					System.out.println("Saisissez le pourcentage d'eau duquel vous videz la bouteille:");
					bottle.remplir(sc.nextDouble());
					break;
				case "rt":
					bottle.remplirTout();
					break;
				case "vt":
					bottle.viderTout();
					break;
				default:
					System.out.println("Saisie invalide.");
					break;
			}	
			
			System.out.println("continuer?\t(n pour non)");
			saisie = sc.next();
		} while (!saisie.equals("n"));
	sc.close();	
	}

}
