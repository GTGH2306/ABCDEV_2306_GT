package Exos;
import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		boolean adulte;
		boolean ancien_conducteur;
		boolean client_fidele;
		int accident;
		int tarif;
		String resultat;
		String saisie;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Le client a 25 ans ou plus?\n(O ou o pour Oui)\t(N ou n pour Non)");
		saisie = sc.next();
		if (saisie.equals("O") || saisie.equals("o")) {
			adulte = true;
		} else {
			adulte = false;
		}
		
		System.out.println("Le client a le permis depuis 2 ans ou plus?\n(O ou o pour Oui)\t(N ou n pour Non)");
		saisie = sc.next();
		if (saisie.equals("O") || saisie.equals("o")) {
			ancien_conducteur = true;
		} else {
			ancien_conducteur = false;
		}
		
		System.out.println("Saisissez le nombre d'accidents du client:");
		accident = sc.nextInt();
		
		System.out.println("Est-il client depuis 5 ans ou plus?\n(O ou o pour Oui)\t(N ou n pour Non)");
		saisie = sc.next();
		if (saisie.equals("O") || saisie.equals("o")) {
			client_fidele = true;
		} else {
			client_fidele = false;
		}
		
		if ((!adulte && ancien_conducteur) || (adulte && !ancien_conducteur)) {
			tarif = 2;
		} else if (adulte && ancien_conducteur) {
			tarif = 3;
		} else {
			tarif = 1;
		}
		tarif -= accident;
		
		if (tarif > 0) {
			if (client_fidele) {
				tarif ++;
			}
			switch (tarif) {
			case 1:
				resultat = "Rouge";
				break;
			case 2:
				resultat = "Orange";
				break;
			case 3:
				resultat = "Vert";
				break;
			default:
				resultat = "Bleu";
			}
			System.out.println("Le client est eligible au tarif " + resultat + ".");
		} else {
			System.out.println("Le client n'est pas eligible a l'assurance.");
		}
		sc.close();
		
	}

}
