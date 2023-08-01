package FoncSupp;
import java.util.Scanner;


public class Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		int nbr1;
		int nbr2;
		
		while (!quit) {
			System.out.println("\n\t[Addition, saisissez 0 pour quitter]\nSaisissez A : ");
			nbr1 = sc.nextInt();
			if (nbr1 == 0) {
				quit = true;
			} else {
				System.out.println("Saisissez B : ");
				nbr2 = sc.nextInt();
				System.out.println(nbr1 + " + " + nbr2 + " = " + addition(nbr1, nbr2));
			}
			
		}
		System.out.println("\t[Fermeture.]");
		sc.close();
		
		
	}
	
	private static int addition(int a, int b) {
		return (a + b);
	}

}
