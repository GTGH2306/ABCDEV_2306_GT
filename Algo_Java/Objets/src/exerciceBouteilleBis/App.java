package exerciceBouteilleBis;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String saisie;
		Scanner sc = new Scanner(System.in);
		Bouteille bottle = new Bouteille();
		boolean quitter = false;
		do {
			System.out.println("(o pour ouvrir)\t\t(f pour fermer)\t\t(a pour afficher contenu)\n(r pour remplir)\t(v pour vider)\t\t(q pour quitter)");
			saisie = sc.nextLine();
			switch (saisie) {
				case "o":
					bottle.ouvrir();
					break;
				case "f":
					bottle.fermer();
					break;
				case "r":
					System.out.println("Saisissez le liquide dont vous remplissez la bouteille: ");
					saisie = sc.nextLine();
					System.out.println("Saisissez le pourcentage de liquide vous remplissez la bouteille:");
					bottle.remplir(sc.nextDouble(), saisie);
					sc.nextLine();
					break;
				case "v":
					System.out.println("Saisissez le nombre de pourcent dont vous videz la bouteille:");
					bottle.vider(sc.nextDouble());
					sc.nextLine();
					break;
				case "rt":
					System.out.println("Saisissez le liquide dont vous remplissez la bouteille: ");
					saisie = sc.nextLine();
					bottle.remplirTout(saisie);
					break;
				case "vt":
					bottle.viderTout();
					break;
				case "a":
					bottle.afficher();
					break;
				case "q":
					quitter = true;
					break;
				default:
					System.out.println("Saisie invalide.");
					break;
			}	
		} while (!quitter);
	sc.close();	
	}

}
