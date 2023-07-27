package jalon_algo_niveau4_GT;
import java.util.Scanner;

public class Jalon_algo_niveau4_GT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saisie; //La longueur que fera le tableau
		long[] fibonacci; //Tableau qui stockera la suite de fibonacci sur une longueur donnée
		
		do {
			do {
				System.out.println("Combien de nombre(s) de la suite de Fibonacci souhaitez-vous afficher :\n(Saisissez 0 pour quitter le programme)");
				saisie = sc.nextInt(); //Saisie utilisateur
				if (saisie < 0) { //On ne peux pas afficher -x nombres d'une suite
					System.out.println("Saisie invalide.");
				}
			} while (saisie < 0); //Boucle tant que l'utilisateur n'as pas entré une saisie valide
			
			if (saisie != 0) { //Ne fais le programme que si l'utilsateur n'as pas mis 0
				fibonacci = new long[saisie]; //Le tableau prend la longueur de nombre qu'à demander l'utilsateur
				fibonacci[0] = 0; //Le premier nombre est forcement 0
				if (saisie > 1) { //Sans cette condition, la valeur 1 serait saisie en dehors du tablea ( = crash)
					fibonacci[1] = 1; //Le deuxième nombre est forcement 1
				}
				
				for (int i = 2; i < saisie; i++) { //Boucle qui affecte la suite de fibonacci sur le reste de la longueur du tableau
					fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
				}
				
				System.out.println("Le(s) " + saisie + " premier(s) nombre(s) de la suite de Fibonacci sont");
				for (int i = 0; i < saisie; i++) { //Boucle qui affiche le tableau
					System.out.print("\n\t" + fibonacci[i]);
				}
				
				System.out.println("\n\n" + saisie + " nombre(s) affiche(s).");
			}
		} while (saisie != 0); //Si l'utilisateur a mis "0", le programme ne se relance pas et s'arrête.
		System.out.println("Fermeture programme.");
		sc.close();
	}

}
