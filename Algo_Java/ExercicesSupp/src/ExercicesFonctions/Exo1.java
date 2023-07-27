package ExercicesFonctions;
import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		int nbra;
		int nbrb;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisissez A :");
		nbra = sc.nextInt();
		System.out.println("Saisissez B :");
		nbrb = sc.nextInt();
		
		System.out.println("A est : " + nbra + "\tB est : " + nbrb);
		
		inverse(nbra, nbrb);
		
		
		sc.close();
	}
	
	private static void inverse(int nb1, int nb2) {
		int temp = nb1;
		nb1 = nb2;
		nb2 = temp;
		System.out.println("A est : " + nb1 + "\tB est : " + nb2);
	}
}
