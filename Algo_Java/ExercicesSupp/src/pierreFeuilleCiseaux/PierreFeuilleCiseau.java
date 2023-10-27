package pierreFeuilleCiseaux;
import java.util.Scanner;

public class PierreFeuilleCiseau {

	private static String rdmRps() {
		int rdm = (int)(Math.random() * 3) + 1;
		String result;
		switch (rdm) {
			case 1:
				result = "Pierre";
				break;
			case 2:
				result = "Feuille";
				break;
			default:
				result = "Ciseaux";
				break;
		}
		return result;
	}
	
	private static String userRps(char a) {
		String result = null;
			switch (a) {
			case 'P','p':
				result = "Pierre";
				break;
			case 'F','f':
				result = "Feuille";
				break;
			case 'C','c':
				result = "Ciseaux";
				break;
			default:
				result = "Invalide";
				break;
			}
	return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char saisie;
		String user;
		String ordi;
		boolean quit = false;
		boolean win;
		boolean lose;
		int points_user = 0;
		int points_ordi = 0;
		
		while (!quit) {
			win = false;
			lose = false;
			
			do {
				System.out.println("[Pierre, Feuille, Ciseaux]\nSaisissez 'P' pour Pierre, 'F' pour Feuille ou 'C' pour Ciseaux :");
				System.out.println("(Saisissez Q si vous voulez quitter)");
				saisie = sc.next().charAt(0);
				if (saisie == 'q' || saisie == 'Q') {
					quit = true;
				}
				user = userRps(saisie);
			} while (user.equals("Invalide") && !quit);
			if (!quit) {
				ordi = rdmRps();
				System.out.println("L'ordinateur fait " + ordi + ".");
				
				win = ((user.equals("Pierre") && ordi.equals("Ciseaux")) || (user.equals("Feuille") && ordi.equals("Pierre")) || (user.equals("Ciseaux") && ordi.equals("Feuille")));
				lose = ((user.equals("Pierre") && ordi.equals("Feuille")) || (user.equals("Feuille") && ordi.equals("Ciseaux")) || (user.equals("Ciseaux") && ordi.equals("Pierre")));
				
				if (win) {
					System.out.println("Vous gagnez !");
					points_user ++;
				} else if (lose) {
					System.out.println("L'ordi gagne !");
					points_ordi ++;
				} else {
					System.out.println("Egalit� !");
				}
			}
			System.out.println("Vous : " + points_user + " points.\nL'ordi : " + points_ordi + " points.");
		}
		sc.close();
		System.out.println("\t[Fin de programme.]");
		
	}
}