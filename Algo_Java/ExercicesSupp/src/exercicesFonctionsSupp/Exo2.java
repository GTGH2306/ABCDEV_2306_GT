package exercicesFonctionsSupp;
import java.util.Scanner;
public class Exo2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Saisissez une phrase ou un mot : ");
		String saisie = sc.nextLine();
		
		System.out.println("Il y'a " + nbrVoyelle(saisie) + " voyelle(s) dans cette saisie.");
		sc.close();
	}
	
	private static int nbrVoyelle(String mot) {
		int voyelles = 0;
		mot = mot.toLowerCase();
		for (int i = 0; i < mot.length(); i++) {
			if (mot.charAt(i) == 'a' ||
					mot.charAt(i) == 'e' ||
					mot.charAt(i) == 'i' ||
					mot.charAt(i) == 'o' ||
					mot.charAt(i) == 'u' ||
					mot.charAt(i) == 'y') {
				voyelles ++;
			}
		}
		return voyelles;
	}
}
