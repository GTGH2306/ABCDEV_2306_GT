package jalon_algo_niveau3_GT;
import java.util.Scanner;

public class Jalon_algo_niveau3_GT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbr;
		String saisie;
		
		do { //Boucle qui s'execute au moins une fois et boucle tant que l'utilisateur ne dis pas Non.
			do { //Boucle qui vérifie que l'utilisateur rentre bien un nombre entre 1 et 10.
				System.out.println("Saisir un nombre entre 1 et 10 :"); 
				nbr = sc.nextInt();
				if (nbr < 1 || nbr > 10) {
					//Si inférieur à 1 ou supérieur à 10, la saisie n'est pas bonne.
					System.out.println("Saisie invalide.");
				}
			} while (nbr < 1 || nbr > 10);
			//Sort de la boucle quand la saisie est valide.
			
			for (int i = 0; i <= 10; i++) { //Affiche la table de multiplication du nombre entré.
				System.out.println(i + " * " + nbr + " = " + i * nbr);
			}
			
			
			do { //Boucle qui vérifie que l'utilisateur a répondu O ou o pour Oui, ou N ou n pour Non.
				System.out.println("Souhaitez vous afficher une autre table de multiplication ? Oui(O) ou Non(n)");
				saisie = sc.next();
				
				if (!saisie.equals("o") && !saisie.equals("O") && !saisie.equals("n") && !saisie.equals("N")) {
					//Si autre chose que O, o, N ou n, la saisie est invalide.
					System.out.println("Saisie invalide.");
				}
			} while (!saisie.equals("o") && !saisie.equals("O") && !saisie.equals("n") && !saisie.equals("N"));
			//Sort de la boucle si la saisie est O, o, N ou n.
		} while (saisie.equals("o") || saisie.equals("O"));
		//La boucle se relance si la réponse est o ou O.
		sc.close();
	}

}
