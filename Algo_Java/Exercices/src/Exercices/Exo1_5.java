package Exercices;
import java.util.Scanner;

public class Exo1_5 {
	public static void main(String args[]) {
		int a;
		int b;
		int temp;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("Programme d'échange entre une valeur A et B.");
		System.out.println("Saisissez votre valeur A: ");
		a = scanner.nextInt();
		System.out.println("Saisissez votre valeur B: ");
		b = scanner.nextInt();
		System.out.println("Votre valeur A est " + a + " et votre valeur B est " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Votre valeur A est maintenant " + a + " et votre valeur B est maintenant " + b);
		
		scanner.close();
	}
}
