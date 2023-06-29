package Exercices;
import java.util.Scanner;


public class Exo2_1 {
	public static void main(String args[]) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir votre age: ");
		age = sc.nextInt();
		
		if (age < 0) {
			System.out.println("Vous n'etes pas encore ne.");
		} else if (age < 18) {
			System.out.println("Vous n'etes pas majeur.");
		} else {
			System.out.println("Vous etes majeur.");
		}
		
		sc.close();
	}
}
