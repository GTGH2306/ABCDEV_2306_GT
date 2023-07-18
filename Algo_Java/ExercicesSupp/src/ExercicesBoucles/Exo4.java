package ExercicesBoucles;
import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre pour calculer la somme de ses entiers jusqu'à ce nombre : ");
		int nbr = sc.nextInt();
		int resultat = 0;
		
		for (int i = 0; i <= nbr; i++) {
			resultat += i;
		}
		System.out.println("La somme des entiers jusqu'a " + nbr + " est de " + resultat + ".");
		sc.close();
	}

}
