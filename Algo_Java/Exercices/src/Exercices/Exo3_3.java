package Exercices;
import java.util.Scanner;

public class Exo3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int powTwo[] = {1, 2, 4, 8, 16, 32, 64, 128, 256};
		boolean present = false;
		int saisie;
		
		
		System.out.println("Entrez un nombre pour voir si c'est une puissance de 2 dans un octet :");
		saisie = sc.nextInt();
		
		for (int i = 0; i < powTwo.length; i++) {
			if (powTwo[i] == saisie) {
				present = true;
			}
		}
		if (present) {
			System.out.println(saisie + " est une puissance de 2 possible dans un octet.");
		} else {
			System.out.println(saisie + " n'est pas une puissance de 2 possible dans un octet.");
		}
		
		sc.close();
	}

}
