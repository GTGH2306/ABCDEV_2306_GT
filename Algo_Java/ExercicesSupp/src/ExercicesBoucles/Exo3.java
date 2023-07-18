package ExercicesBoucles;
import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre : \n");
		int saisie = sc.nextInt();
		
		for (int i = 10; i > 0; i--) {
			saisie ++;
			if (i > 1) {
			System.out.print(saisie + ", ");
			} else {
				System.out.print(saisie);
			}
		}
		sc.close();
	}

}
