package Exercices;
import java.util.Scanner;

public class Exo1_1 {
	public static void main (String[] args) {
		int nbr1;
		int nbr2;
		float result;
		Scanner scanner;
		
		scanner = new Scanner(System.in);
		
		System.out.println("Entrez la valeur de A: ");
		nbr1 = scanner.nextInt();
		
		System.out.println("Entrez la valeur de B: ");
		nbr2 = scanner.nextInt();
		
		result = (nbr1 + nbr2)/2f;
		
		System.out.println("La moyenne de " + nbr1 + " et " + nbr2 + " est " + result);
		
		scanner.close();
		
	}
}
