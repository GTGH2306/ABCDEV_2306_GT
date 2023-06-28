package Exercices;
import java.util.Scanner;

public class Exo1_1 {
	public static void main (String[] args) {
		float nbr1;
		float nbr2;
		float result;
		Scanner scanner;
		
		scanner = new Scanner(System.in);
		
		System.out.println("Entrez la valeur de A: ");
		nbr1 = scanner.nextFloat();
		
		System.out.println("Entrez la valeur de B: ");
		nbr2 = scanner.nextFloat();
		
		result = (nbr1 + nbr2)/2;
		
		System.out.println("La moyenne de " + nbr1 + " et " + nbr2 + " est " + result);
		
		scanner.close();
		
	}
}
