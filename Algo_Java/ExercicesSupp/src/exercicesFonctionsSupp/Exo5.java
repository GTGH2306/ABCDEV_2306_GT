package exercicesFonctionsSupp;

import java.util.Scanner;

public class Exo5 {

	private static void majeurOuMineur(int a) {
		if (a >= 18) {
			System.out.println("Vous êtes majeur.");
		} else if (a < 0) {
			System.out.println("Vous n'êtes pas né.");
		} else {
			System.out.println("Vous êtes mineur.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre âge :");
		int age = sc.nextInt();
		
		majeurOuMineur(age);
		sc.close();
	}

}
