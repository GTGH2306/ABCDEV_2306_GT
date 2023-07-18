package ExercicesBoucles;
import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		int pos = 0;
		int haut = 0;
		Scanner sc = new Scanner(System.in);
		int saisie;
		int i = 1;
		
		do {
			System.out.println("Saisissez le nombre en position " + i + " ou \"0\" pour quitter.");
			saisie = sc.nextInt();
			if (saisie > haut) {
				haut = saisie;
				pos = i;
			}
			i ++;
		} while (saisie != 0);
		System.out.println("Le nombre le plus haut était \"" + haut + "\" en position " + pos);
		sc.close();
	}

}
