package Exercices;
import java.util.Scanner;

public class Exo2_6 {

	public static void main(String[] args) {
		
		double diviseur = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre :");
		int saisie= sc.nextInt();
		boolean nonpremier = false;
		
		if (saisie == 1 || saisie == 0 || saisie == -1) {
			nonpremier = true;
		}
		
		while (saisie > diviseur && nonpremier == false) {
			if ((saisie % diviseur)  == 0) {
				nonpremier = true;
			} else {
				diviseur += 1;
			}
		}
		if (nonpremier == true) {
			System.out.println(saisie + " n'est pas un nombre premier.");
		} else {
			System.out.println(saisie + " est un nombre premier.");
		}
		
		sc.close();
	}

}