package exercicesFonctionsSupp;
import java.util.Scanner;

public class Exo1 {
	private static int somme(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t[Somme de 5 nombres]");
		System.out.println("Saisissez A :");
		int nbr1 = sc.nextInt();
		System.out.println("Saisissez B :");
		int nbr2 = sc.nextInt();
		System.out.println("Saisissez C :");
		int nbr3 = sc.nextInt();
		System.out.println("Saisissez D :");
		int nbr4 = sc.nextInt();
		System.out.println("Saisissez E :");
		int nbr5 = sc.nextInt();
		
		System.out.println("La somme est de " + somme(nbr1, nbr2, nbr3, nbr4, nbr5) + ".");
		
		sc.close();
	}
}
