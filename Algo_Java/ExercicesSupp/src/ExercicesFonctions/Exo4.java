package ExercicesFonctions;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez une ann�e pour voir si elle est bissextile : ");
		int annee = sc.nextInt();
		
		if (estBissextile(annee)) {
			System.out.println(annee + " est une ann�e bissextile.");
		} else {
			System.out.println(annee + " n'est pas une ann�e bissextile.");
		}
		sc.close();	
	}
	
	private static boolean estBissextile(int an) {
		return (an % 4 == 0 && an % 100 != 0) || an % 400 == 0 ;
	}
}
