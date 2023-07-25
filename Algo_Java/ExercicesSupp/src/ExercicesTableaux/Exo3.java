package ExercicesTableaux;
import java.util.Scanner;

public class Exo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int[] tab;
		int positif = 0;
		int negatif = 0;
		
		System.out.println("Saisissez la taille de votre tableau : ");
		max = sc.nextInt();
		tab = new int[max];
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Saisissez le nombre en position " + i + " : ");
			tab[i] = sc.nextInt();
			if (tab[i] > 0) {
				positif ++;
			} else if (tab[i] < 0) {
				negatif ++;
			}
		}
		System.out.println("Il y'a " + positif + " nombre(s) positif(s).\nIl y'a " + negatif + " nombre(s) negatif(s).");
		sc.close();
	}
}
