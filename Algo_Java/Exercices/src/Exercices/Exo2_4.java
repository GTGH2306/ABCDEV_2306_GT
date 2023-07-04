package Exercices;
import java.util.Scanner;

public class Exo2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saissez une annee: ");
		int saisie = sc.nextInt();
		float divisible = (float)saisie;
		
		if ((divisible % 4) == 0) {
			if (((divisible % 100) == 0) && ((divisible % 400) == 0)) {
				System.out.println("L'annee est bissextile");
			} else if (((divisible % 100) == 0) && ((divisible % 400 != 0))) {
				System.out.println("L'annee n'est pas bissextile");
			} else if ((divisible % 100) != 0) {
				System.out.println("L'annee n'est pas bissextile");
			}
			
		} else {
			System.out.println("L'annee n'est pas bissextile");
		}
	sc.close();
	}

} 