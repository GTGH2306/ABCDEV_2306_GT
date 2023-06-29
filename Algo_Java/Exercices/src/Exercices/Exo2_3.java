package Exercices;
import java.util.Scanner;

public class Exo2_3 {
	public static void main(String args[]) {
		
		int pos1 = 0;
		int pos2 = 0;
		int pos3 = 0;
		boolean resolu = false;
		Scanner sc = new Scanner(System.in);
		
		while (resolu == false) {
			System.out.println("Saisissez valeur A:");
			int nbra = sc.nextInt();
			System.out.println("Saisissez valeur B:");
			int nbrb = sc.nextInt();
			System.out.println("Saisissez valeur C:");
			int nbrc = sc.nextInt();
		
			if (nbra < nbrb && nbra < nbrc ) { //Test si A est en première position
				pos1 = nbra;
				if (nbrb < nbrc) { //Test si B est en deuxième position
					pos2 = nbrb;
					pos3 = nbrc;
					resolu = true;
				} else if(nbrc < nbrb) { //Test si C est en deuxième position
					pos2 = nbrc;
					pos3 = nbrb;
					resolu = true;
				} else {
					System.out.println("Les valeurs saisies sont invalides, assurez vous de saisir des valeurs differentes.");
				}
				
			}else if (nbrb < nbra && nbrb < nbrc ) { //Test si B est en première position
				pos1 = nbrb;
				if (nbra < nbrc) { //Test si A est en deuxième position
					pos2 = nbra;
					pos3 = nbrc;
					resolu = true;
				} else if(nbrc < nbra) { //Test si C est en deuxième position
					pos2 = nbrc;
					pos3 = nbra;
					resolu = true;
				} else {
					System.out.println("Les valeurs saisies sont invalides, assurez vous de saisir des valeurs differentes.");
				}
				
			} else if (nbrc < nbra && nbrc < nbrb ) { //Test si C est en première position
				pos1 = nbrc;
				if (nbrb < nbra) { //Test si B est en deuxième position
					pos2 = nbrb;
					pos3 = nbra;
					resolu = true;
				} else if(nbra < nbrb) { //Test si A est en deuxième position
					pos2 = nbra;
					pos3 = nbrb;
					resolu = true;
				} else {
					System.out.println("Les valeurs saisies sont invalides, assurez vous de saisir des valeurs differentes.");
				}
				
			} else {
				System.out.println("Les valeurs saisies sont invalides, assurez vous de saisir des valeurs differentes.");
			}
		}
		System.out.println("Dans l'ordre croissant les valeurs sont: ");
		System.out.println(pos1 + " < " + pos2 + " < " + pos3);
		
		sc.close();
	}
}
