package FoncSupp;
import java.util.Scanner;

public class FonctionString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre pour savoir s'il est positif ou non : ");
		int nombre = sc.nextInt();
		System.out.println(nombre + " est " + posneg(nombre) + ".");
		sc.close();
		
	}
	
	private static String posneg(int nbr) {
		if (nbr > 0) {
			return "Positif";
		} else if (nbr < 0) {
			return "Négatif";
		} else {
			return "Zéro";
		}
	}

}
