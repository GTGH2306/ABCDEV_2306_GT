package Exercices;
import java.util.Scanner;

public class Exo3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int essaimax;
		int essai = 0;
		int nombre;
		int saisie;
		int max;
		int min = 0;
		boolean win = false;
		
		System.out.println("Le nombre au hasard sera pris entre 0 et ... :");
		max = sc.nextInt();
		System.out.println("Saisissez le nombre d'essais max : ");
		essaimax = sc.nextInt();
		
		
		nombre = (int)Math.round(Math.random() * max);
		System.out.println("Vous avez " + essaimax + " essais pour trouver le nombre pris au hasard.");
		while (!win && essai != essaimax) {
			do {
				System.out.println("Saisissez un nombre entre " + min + " et " + max + ".\nIl vous reste " + (essaimax - essai) + " essai(s):");
				saisie = sc.nextInt();
				if (saisie < min) {
					System.out.println("Saisie trop petite pour etre prise en compte.");
				} else if (saisie > max) {
					System.out.println("Saisie trop grande pour etre prise en compte.");
				}
			} while (saisie < min || saisie > max) ;
			essai ++;
			if (saisie < nombre) {
				System.out.println("C'est plus !");
				min = saisie;
			} else if (saisie > nombre) {
				System.out.println("C'est moins !");
				max = saisie;
			} else {
				win = true;
			}
		}
		if (win) {
			System.out.println("Bravo, le nombre etait bien " + nombre + ".\nVous avez trouve en " + essai + " essai(s).");
		} else {
			System.out.println("Oh non, rate, le nombre etait " + nombre + ".\nVous n'avez pas trouve en " + essai + " essai(s).");
		}
		sc.close();
	}

}
