package ExercicesBoucles;
import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		int pos = 0;
		int haut = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < 21; i++) {
			System.out.println("Saisissez le nombre en position " + i + ".");
			int saisie = sc.nextInt();
			if (saisie > haut) {
				haut = saisie;
				pos = i;
			}
		}
		System.out.println("Le nombre le plus haut etait \"" + haut + "\" en position " + pos);
		sc.close();
	}

}
