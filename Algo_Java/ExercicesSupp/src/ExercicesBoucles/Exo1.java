package ExercicesBoucles;
import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbr = 0;
		
		while (nbr < 1 || nbr > 3) {
			System.out.println("Saisissez un nombre entre 1 et 3 :");
			nbr = sc.nextInt();
			if (nbr < 1) {
				System.out.println("Trop petit !");
			} else if (nbr > 3) {
				System.out.println("Trop grand !");
			}
		}
		System.out.println("Saisie valide, fin du programme.");
		sc.close();
	}

}
