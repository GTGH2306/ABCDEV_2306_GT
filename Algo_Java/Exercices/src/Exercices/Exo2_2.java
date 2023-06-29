package Exercices;
import java.util.Scanner;

public class Exo2_2 {
	public static void main(String args[]) {
		int valeura;
		int valeurb;
		boolean resolu = false;
		
		Scanner sc = new Scanner(System.in);
		
		while (resolu == false) {
			System.out.println("Entrez valeur A:");
			valeura = sc.nextInt();
			System.out.println("Entrez valeur B:");
			valeurb = sc.nextInt();
			
			if (valeura < valeurb) {
				System.out.println("L'ordre croissant est B > A :");
				System.out.println(valeura + " > " + valeurb);
				resolu = true;
			} else if (valeura > valeurb) {
				System.out.println("L'ordre croissant est A > B :");
				System.out.println(valeurb + " > " + valeura);
				resolu = true;
			} else {
				System.out.println("A et B sont egaux, merci de saisir des valeurs differentes.");
			}
		}
		sc.close();
	}

}
