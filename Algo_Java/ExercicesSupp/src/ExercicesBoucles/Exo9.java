package ExercicesBoucles;
import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ordre;
		int desordre;
		
		System.out.println("Saisissez le nombres de chevaux sur la ligne de depart.");
		int chv_start = sc.nextInt();
		
		while (chv_start < 0) {
			System.out.println("Saisie invalide.");
			System.out.println("Saisissez le nombres de chevaux sur la ligne de depart.");
			chv_start = sc.nextInt();
		}
		
		System.out.println("Saisissez le nombres de chevaux sur lesquels vous avez parie.");
		int chv_bet = sc.nextInt();
		
		while (chv_bet > chv_start || chv_bet < 0) {
			System.out.println("Saisie invalide.");
			System.out.println("Saisissez le nombres de chevaux sur lesquels vous avez parie.");
			chv_bet = sc.nextInt();
		}
		
		int fac_n = Factor.entier(chv_start);
		int fac_p = Factor.entier(chv_bet);
		
		ordre = fac_n / Factor.entier(chv_start - chv_bet);
		desordre = fac_n / (fac_p * Factor.entier(chv_start - chv_bet));
		
		System.out.println("Dans l'ordre: une chance sur " + ordre + " de gagner.");
		System.out.println("Dans le desordre: une chance sur " + desordre + " de gagner.");
		sc.close();
		
	}

}
