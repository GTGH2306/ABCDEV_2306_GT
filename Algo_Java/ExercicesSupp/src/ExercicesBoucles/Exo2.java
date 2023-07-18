package ExercicesBoucles;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbr = 0;
		
		while (nbr < 10 || nbr > 20) {
			System.out.println("Saisissez un nombre entre 10 et 20 :");
			nbr = sc.nextInt();
			if (nbr < 10) {
				System.out.println("Plus grand !");
			} else if (nbr > 20) {
				System.out.println("Plus petit !");
			}
		}
		System.out.println("Saisie valide, fin du programme.");
		sc.close();
	}

}
