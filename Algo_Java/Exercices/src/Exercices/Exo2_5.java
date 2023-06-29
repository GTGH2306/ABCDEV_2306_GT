package Exercices;
import java.util.Scanner;

public class Exo2_5 {

	public static void main(String[] args) {
		
		System.out.println("Saisir nombre :");
		Scanner sc = new Scanner(System.in);
		int saisie= sc.nextInt();
		int diviseur = 2;

		while (diviseur < saisie) {
			if ((saisie % diviseur) == 0) {
				System.out.println(diviseur);
			}
			diviseur += 1;
		}
	System.out.println("Fin");
	sc.close();
	}

}
