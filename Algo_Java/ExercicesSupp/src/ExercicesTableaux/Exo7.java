package ExercicesTableaux;

import java.util.Scanner;

public class Exo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int[] tab;
		int[] res;
		
		System.out.println("Saisissez la taille de votre tableau : ");
		max = sc.nextInt();
		tab = new int[max];
		res = new int[tab.length];
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Saisissez le nombre en position " + i + " : ");
			tab[i] = sc.nextInt();
			res[i] = tab[i] + 1;
		}
		
		for (int i : res) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
