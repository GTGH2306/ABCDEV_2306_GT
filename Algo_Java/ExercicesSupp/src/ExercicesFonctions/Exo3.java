package ExercicesFonctions;
import java.util.Scanner;

public class Exo3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Saisissez le premier nombre : ");	
	int nb1 = sc.nextInt();
	System.out.println("Saisissez le second nombre : ");	
	int nb2 = sc.nextInt();
	System.out.println("La moyenne de " + nb1 + " et de " + nb2 + " est " + moyenne(nb1, nb2));
	sc.close();
	}
	
	private static double moyenne(int a, int b) {
		double moyenne = (a + b) / 2d;
		return moyenne;
	}
}
