package exercicesFonctionsSupp;

import java.util.Scanner;

public class Exo5 {

	private static void majeurOuMineur(int a) {
		if (a >= 18) {
			System.out.println("Vous �tes majeur.");
		} else if (a < 0) {
			System.out.println("Vous n'�tes pas n�.");
		} else {
			System.out.println("Vous �tes mineur.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre �ge :");
		int age = sc.nextInt();
		
		majeurOuMineur(age);
		sc.close();
	}

}
