package Exos;
import java.util.Scanner;

public class Exo2_2 {

	public static void main(String[] args) {
		int nbra;
		int nbrb;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez votre premier nombre :");
		nbra = sc.nextInt();
		System.out.println("Saisissez votre deuxieme nombre :");
		nbrb = sc.nextInt();
		
		if ((nbra > 0 && nbrb > 0) || (nbra < 0 && nbrb < 0)) {
			System.out.println("Le produit de " + nbra + " et " + nbrb + " est positif.");
		} else if ((nbra > 0 && nbrb < 0) || (nbra > 0 && nbrb < 0)) {
			System.out.println("Le produit de " + nbra + " et " + nbrb + " est negatif.");
		} else {
			System.out.println("Le produit de " + nbra + " et " + nbrb + " est egal a zero.");
		}
		sc.close();
	}
}
