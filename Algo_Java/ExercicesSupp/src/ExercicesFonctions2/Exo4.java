package ExercicesFonctions2;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int essaimax;
		int essai = 0;
		int nombre;
		int saisie;
		int max;
		int min = 0;
		int ordi;
		boolean win = false;
		boolean perdu = false;
		
		System.out.println("Le nombre au hasard sera pris entre 0 et ... :");
		max = sc.nextInt();
		System.out.println("Saisissez le nombre d'essais max : ");
		essaimax = sc.nextInt();
		
		
		nombre = (int)Math.round(Math.random() * max);
		System.out.println("Vous avez " + essaimax + " essais pour trouver le nombre pris au hasard.");
		while (!win && essai != essaimax && !perdu) {
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
			
			if (!win) {
				ordi = ordi(min, max);
				System.out.println("L'ordinateur essai le nombre " + ordi);
				if (ordi < nombre) {
					System.out.println("C'est plus !");
					min = ordi;
				} else if (ordi > nombre) {
					System.out.println("C'est moins !");
					max = ordi;
				} else {
					perdu = true;
				}
			}
			
		}
		if (win) {
			System.out.println("Bravo, le nombre etait bien " + nombre + ".\nVous avez trouve en " + essai + " essai(s).");
		} else if (perdu) {
			System.out.println("Oh mince, l'ordinateur a trouvé avant vous en " + essai + " essai(s), le nombre était bien " + nombre);
		}else {
			System.out.println("Oh non, raté, le nombre etait " + nombre + ".\nVous n'avez pas trouve en " + essai + " essai(s).");
		}
		sc.close();
	}
	
	private static int ordi(int min, int max) {
		
		int minimum = min + 1;
		int maximum = max - 1;
		
		int random = (int)Math.floor(Math.random() *(maximum - minimum + 1) + minimum);
		
		return random;
	}

}
