package Exercices;
import java.util.Scanner;

public class Exo3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;
		char lettre;
		int nbr_lettre = 0;
		boolean point = false;
		boolean valide = false;
		
		while (!valide){
			System.out.println("Saisissez une phrase a analyser : ");
			phrase = sc.next();
			System.out.println("Saisissez lettre a chercher : ");
			lettre = sc.next().charAt(0);
			valide = true;
			point = false;
			
			if (Character.isAlphabetic(lettre) == false) {
				valide = false;
			}
			
			for (int i = 0; i < phrase.length(); i++) {
				
			}
		}
		
		
	}

}
