package ExercicesBoucles;

import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		int monnaie = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int saisie;
		
		do {
			System.out.println("Saisissez le prix de votre article ou \"0\" pour arrêter.");
			saisie = sc.nextInt();
			total += saisie;
		} while (saisie != 0);
		System.out.println("Votre total est de " + total + " euros");
		System.out.println("Saisissez l'argent que vous donnez : ");
		saisie = sc.nextInt();
		while (saisie < total) {
			System.out.println("Insuffisant, vous devez donner au moins autant que le total.");
			System.out.println("Saisissez l'argent que vous donnez : ");
			saisie = sc.nextInt();
		}
		monnaie = saisie - total;
		System.out.println("Le vendeur doit vous rendre " + monnaie + " euros.");
		sc.close();
	}

}
