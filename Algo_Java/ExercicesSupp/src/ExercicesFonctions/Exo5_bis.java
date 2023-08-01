package ExercicesFonctions;
import java.util.Scanner;

public class Exo5_bis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] date = new int[3];
		
		do {
			System.out.println("Saisissez un jour : ");
			date[0] = sc.nextInt();
			System.out.println("Saisissez un mois : ");
			date[1] = sc.nextInt();
			System.out.println("Saisissez une année : ");
			date[2] = sc.nextInt();
			
			if (!dateValide(date)) {
				System.out.println("Date saisie invalide.");
			}
		} while (!dateValide(date));
		sc.close();
		System.out.println("Date valide.");
	}
	
	
	private static boolean dateValide(int[] date) {
		boolean invalide = false;
		boolean bisextile;
		int jour = date[0];
		int mois = date[1];
		int annee = date[2];
		
		if (jour > 0 && mois > 0 && mois < 13 && annee != 0) {
			if (((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) && annee > 0) {
				bisextile = true;
			} else {
				bisextile = false;
			}
			switch (mois) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (jour > 31) {
					invalide = true;
				} else {
					invalide = false;
				}
				break;
			case 4, 6, 9, 11:
				if (jour > 30) {
					invalide = true;
				} else {
					invalide = false;
				}
				break;
			default:
				if (bisextile) {
					if (jour > 29) {
						invalide = true;
					} else {
						invalide = false;
					}
				} else {
					if (jour > 28) {
						invalide = true;
					} else {
						invalide = false;
					}
				}
			}
		} else {
			invalide = true;
		}
		
		if (invalide) {
			return false;
		} else {
			return true;
		}
		
	}
}
