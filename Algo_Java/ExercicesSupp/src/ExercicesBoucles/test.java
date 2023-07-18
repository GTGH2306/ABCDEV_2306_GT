package ExercicesBoucles;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre pour calculer sa factorielle : ");
		int nbr = sc.nextInt();
		int resultat = Factor.entier(nbr); 

		System.out.println("Factorialise " + nbr + " devient " + resultat + ".");
		sc.close();
	}

}
