package ExercicesFonctions;
import java.util.Scanner;

public class Exo1_bis {

	public static void main(String[] args) {
		int[] nbra = new int[1];
		int[] nbrb = new int[1];
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisissez A :");
		nbra[0] = sc.nextInt();
		System.out.println("Saisissez B :");
		nbrb[0] = sc.nextInt();
		
		System.out.println("A est : " + nbra[0] + "\tB est : " + nbrb[0]);
		
		inverse(nbra, nbrb);
		
		System.out.println("A est : " + nbra[0] + "\tB est : " + nbrb[0]);
		
		sc.close();
	}
	
	private static void inverse(int[] nb1, int[] nb2) {
		int[] temp = new int[1];
		temp[0] = nb1[0];
		nb1[0] = nb2[0];
		nb2[0] = temp[0];
	}
}
