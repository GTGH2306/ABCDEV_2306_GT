package Exercices;
import java.util.Scanner;

public class Exo3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;
		char lettre = 'A';
		int nbr_lettre = 0;
		boolean point = false;
		boolean valide = false;
		int total_lettre = 0;
		
		while (!valide){
			System.out.println("Saisissez une phrase a analyser : ");
			phrase = sc.nextLine();
			System.out.println("Saisissez lettre a chercher : ");
			lettre = sc.nextLine().charAt(0);
			valide = true;
			point = false;
			nbr_lettre = 0;
			total_lettre = 0;
			
			if (Character.isAlphabetic(lettre) == false) { //Verifie que la lettre qu'on veux vérifier est bien une lettre
				valide = false;
			}
			
			if (phrase.charAt(phrase.length() - 1) != '.') { //Verifie que la phrase ce termine par un point
				valide = false;
			}
			
			lettre = Character.toLowerCase(lettre); // met tout en minuscule
			phrase = phrase.toLowerCase();
			
			if (valide) { //Si phrase valide
				for (int i = 0; i < phrase.length(); i++) { //Verifier chaque caractère
					if (phrase.charAt(i) == '.' && !point) { //Si c'est un point, dire qu'il y'en a un
						point = true;
					} else if (phrase.charAt(i) == '.' && point) { //Si c'est le deuxième point, la phrase n'est pas valide
						valide = false;
					} else if (phrase.charAt(i) == lettre) { //+1 au nbr de la lettre si elle est présente
						nbr_lettre ++;
						total_lettre ++;
					} else {
						total_lettre ++;
					}
				}
			}
			
			if (!valide) {
				System.out.println("Erreur de saisie, merci de saisir une vrai phrase et une vrai lettre.");
			}
		}
		if (total_lettre == 0) {
			System.out.println("La phrase est vide.");
		} else if(nbr_lettre == 0) {
			System.out.println("La lettre \"" + lettre + "\" n'est pas présente dans la phrase.");
		}else {
			System.out.println("Il y'a " + nbr_lettre + " fois la lettre \"" + lettre + "\" dans cette phrase.");
		}
		sc.close();
	}
}
