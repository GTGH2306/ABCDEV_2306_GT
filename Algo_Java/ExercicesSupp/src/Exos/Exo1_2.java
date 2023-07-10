package Exos;
import java.util.Scanner;

public class Exo1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre :");
		int nbr = sc.nextInt();

		
			if (nbr < 0) {
				System.out.println(nbr + " est un nombre negatif.");
			} else if (nbr == 0) {
				System.out.println(nbr + " est egal a zero.");
			}
			else {
				System.out.println(nbr + " est un nombre positif.");
			}
		sc.close();
	}

}
