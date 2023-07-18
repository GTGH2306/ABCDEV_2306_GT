package ExercicesBoucles;
import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre pour calculer sa factorielle : ");
		int nbr = sc.nextInt();
		int resultat = 1;
		
		for (int i = 1; i <= nbr; i++) {
			resultat = resultat * i;
		}
		System.out.println("Factorialise " + nbr + " devient " + resultat + ".");
		sc.close();
	}

}
