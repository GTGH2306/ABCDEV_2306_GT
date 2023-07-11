package Exos;
import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		boolean imposable;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour Zorglubien,\nMerci de saisir votre age:");
		int age = sc.nextInt();
		System.out.println("De quel sexe etes-vous?\n(M pour Masculin)\t(F pour Feminin)");
		String sexe = sc.next();
		
		if ((sexe.equals("M") || sexe.equals("m")) && age > 20) {
			imposable = true;
		} else if ((sexe.equals("F") || sexe.equals("f")) && age >= 18 && age <= 35) {
			imposable = true;
		} else {
			imposable = false;
		}
		if (imposable) {
			System.out.println("Vous etes eligible a la fraude fiscal.");
		} else {
			System.out.println("Vous etes non-imposable.");
		}
		sc.close();
	}

}
