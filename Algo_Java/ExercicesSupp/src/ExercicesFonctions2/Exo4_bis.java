package ExercicesFonctions2;
import java.util.Scanner;

public class Exo4_bis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] minmax_user;
		int[] minmax_ordi;
		int nombre_essai;
		int essai_max = 10;
		int essai_user;
		int essai_ordi;
		int nombre_user;
		int nombre_ordi;
		boolean quit = false;
		boolean win = false;
		boolean lose = false;
		String reponse;
		
		
		do {
			minmax_user = new int[] {0, 100};
			minmax_ordi = new int[] {0, 100};
			nombre_user = random(minmax_user[0], minmax_user[1]);
			nombre_ordi = random(minmax_ordi[0], minmax_ordi[1]);
			nombre_essai = 0;
			win = false;
			lose = false;
			
				do {
					
					System.out.println("Il vous reste " + (essai_max - nombre_essai) + " essai(s).");
					System.out.println("Saisissez un nombre entre " + minmax_user[0] + " et " + minmax_user[1] + " : ");
					essai_user = sc.nextInt();
					win = plusmoins(nombre_user, essai_user, minmax_user);
					
					if (!win) {
						essai_ordi = random(minmax_ordi[0], minmax_ordi[1]);
						System.out.println("L'ordinateur a un nombre entre " + minmax_ordi[0] + " et " + minmax_ordi[1]);
						System.out.println("L'ordinateur essai " + essai_ordi);
						lose = plusmoins(nombre_ordi, essai_ordi, minmax_ordi);
					}
					nombre_essai ++;
				} while(!lose && !win && nombre_essai != essai_max) ;
				
				if (win) {
					System.out.println("Vous avez trouvé avant l'ordinateur! Et en " + nombre_essai + " essai(s)!");
				} else if (lose) {
					System.out.println("Perdu, l'ordinateur a trouvé avant, son nombre était " + nombre_ordi + ". Votre nombre était " + nombre_user);
				} else {
					System.out.println("Perdu, vous n'avez pas trouvé en " + nombre_essai + " le nombre était " + nombre_user);
				}
				
				do {
					System.out.println("Souhaitez-vous refaire une partie?\n(O pour Oui)\t(N pour Non)");
					reponse = sc.next();
					
					if (reponse.equals("O") || reponse.equals("o")) {
						quit = false;
					} else if (reponse.equals("N") || reponse.equals("n")) {
						quit = true;
					} else {
						System.out.println("Saisie invalide.");
					}
				} while (!reponse.equals("O") && !reponse.equals("o") && !reponse.equals("N") && !reponse.equals("n"));
			
			} while (!quit);
		System.out.println("Fin de programme.");
		sc.close();
		}
	
	private static int random(int min, int max) {
		int rdm = (int)Math.floor(Math.random() * (max - min + 1) + min);
		return rdm;
	}
	
	private static boolean plusmoins(int rdm, int essai, int[] minmax) {
		
		if (essai > rdm) {
			System.out.println("C'est moins que " + essai);
			if (essai < minmax[1]) {
				minmax[1] = essai;
			}
			return false;
		} else if (essai < rdm) {
			System.out.println("C'est plus que " + essai);
			if (essai > minmax[0]) {
				minmax[0] = essai;
			}
			return false;
		} else {
			return true;
		}
	}

}
