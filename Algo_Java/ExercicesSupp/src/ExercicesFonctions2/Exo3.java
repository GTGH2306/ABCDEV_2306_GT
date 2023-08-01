package ExercicesFonctions2;
import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir A : ");
		int nbr1 = sc.nextInt();
		System.out.println("Saisir B : ");
		int nbr2 = sc.nextInt();
		
		if (divisible(nbr1, nbr2)) {
			System.out.println(nbr1 + " est divisible par " + nbr2);
		} else {
			System.out.println(nbr1 + " n'est pas divisible par " + nbr2);
		}
		sc.close();
	}

	private static boolean divisible(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
