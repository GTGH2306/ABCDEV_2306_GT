package ExercicesTableaux;

import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int[] tab;
		int poshaut = -1;
		int haut = 0;
		
		System.out.println("Saisissez la taille de votre tableau : ");
		max = sc.nextInt();
		tab = new int[max];
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Saisissez le nombre en position " + i + " du tableau : ");
			tab[i] = sc.nextInt();
			
		}
		
		
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > haut) {
				haut = tab[i];
				poshaut = i;
			}
		}
		
		System.out.println("Le nombre le plus haut du tableau est " + haut + " qui est a la position " + poshaut + " du tableau.");
		sc.close();
	}

}
