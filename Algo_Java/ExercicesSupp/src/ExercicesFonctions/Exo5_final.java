package ExercicesFonctions;
import java.time.LocalDate;
import java.util.Scanner;


public class Exo5_final {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] saisie = new int[3];
		
		System.out.println("\t[Saisissez une date pour vérifier quel jour de la semaine c'était.]");
		
		do {
			System.out.println("Saisir jour :");
			saisie[0] = sc.nextInt();
			System.out.println("Saisir mois :");
			saisie[1] = sc.nextInt();
			System.out.println("Saisir année :");
			saisie[2] = sc.nextInt();
			
			if (!dateValide(saisie)) {
				System.out.println("Saisie invalide.");
			}
		} while(!dateValide(saisie));
		
		System.out.println("Le " + saisie[0] + "/" + saisie[1] + "/" + saisie[2] + " est un " + jourSemaine(saisie) + ".");
		
		sc.close();
	}
	
	
	private static String jourSemaine(int[] date) {
		int jour;
		String jourSemaine;
		LocalDate dateObj = LocalDate.of(date[2], date[1], date[0]);
		
		
		jour = dateObj.getDayOfWeek().getValue();
		
		switch(jour)
		{
			case 1:
				jourSemaine = "Lundi";
				break;
			case 2:
				jourSemaine = "Mardi";
				break;
			case 3:
				jourSemaine = "Mercredi";
				break;
			case 4:
				jourSemaine = "Jeudi";
				break;
			case 5:
				jourSemaine = "Vendredi";
				break;
			case 6:
				jourSemaine = "Samedi";
				break;
			default:
				jourSemaine = "Dimanche";
				break;		
		}
		return jourSemaine;
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
