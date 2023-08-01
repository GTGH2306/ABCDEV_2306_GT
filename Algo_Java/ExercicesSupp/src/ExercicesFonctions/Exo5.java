package ExercicesFonctions;
import java.util.Scanner;

public class Exo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] date = new int[3];
		System.out.println("Saisissez le jour :");
		date[0] = sc.nextInt();
		System.out.println("Saisissez le mois :");
		date[1] = sc.nextInt();
		System.out.println("Saisissez l'année :");
		date[2] = sc.nextInt();
		
		System.out.println("Le " + date[0] + "/" + date[1] + "/" + date[2] + " tombe un " + jourSemaine(date) + ".");
		sc.close();
	}
	
	private static String jourSemaine(int[] date) {
		int an = date[2] - 1;
		int jourTotal;
		int offset;
		String jour;
		
		if (estBissextile(date[2])) {
			switch (date[1]) {
			case 1, 4, 7:
				offset = 0;
				break;
			case 10:
				offset = 1;
				break;
			case 5:
				offset = 2;
				break;
			case 2, 8:
				offset = 3;
				break;
			case 3, 11:
				offset = 4;
				break;
			case 6:
				offset = 5;
				break;
			default:
				offset = 6;
				break;
			}
		} else {
			switch (date[1]) {
			case 1, 10:
				offset = 0;
				break;
			case 5:
				offset = 1;
				break;
			case 8:
				offset = 2;
				break;
			case 2, 3, 11:
				offset = 3;
				break;
			case 6:
				offset = 4;
				break;
			case 9, 12:
				offset = 5;
				break;
			default:
				offset = 6;
				break;
			}
		}
		
		jourTotal = (date[0] + offset + 5 * (an % 4) + 4 * (an % 100) + 6 * (an % 400)) % 7;
		switch (jourTotal) {
		case 1:
			jour = "Lundi";
			break;
		case 2:
			jour = "Mardi";
			break;
		case 3:
			jour = "Mercredi";
			break;
		case 4:
			jour = "Jeudi";
			break;
		case 5:
			jour = "Vendredi";
			break;
		case 6:
			jour = "Samedi";
			break;
		default:
			jour = "Dimanche";
			break;
		}
		
		return jour;
	}
	
	
	private static boolean estBissextile(int an) {
		
		if ((an % 4 == 0 && an % 100 != 0) || an % 400 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
