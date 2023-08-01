package ExercicesFonctions;
import java.util.Scanner;
public class Exo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nb1;
		double nb2;
		double nb3;
		
		
		System.out.println("\t[Calcul de p�rim�tre et aire d'un triangle]\nSaisissez la longueur du c�t� A du triangle : ");
		nb1 = sc.nextDouble();
		System.out.println("Saisissez la longueur du c�t� B du triangle : ");
		nb2 = sc.nextDouble();
		System.out.println("Saisissez la longueur du c�t� C du triangle : ");
		nb3 = sc.nextDouble();
		
		aire(nb1, nb2, nb3);
		sc.close();
	}
	
	private static void aire(double a, double b, double c) {
		double perimetre = a + b + c;
		double demi = perimetre / 2d;
		perimetre = Math.round(perimetre * 1000) / 1000d;
		double aire = demi * (demi - a) * (demi - b) * (demi - c);
		aire = Math.sqrt(Math.abs(aire));
		aire = Math.round(aire * 1000) / 1000d;
		
		
		System.out.println("Le p�rim�tre du triangle est de " + (demi * 2));
		System.out.println("L'aire du triangle est de " + aire);
		
	}

}
