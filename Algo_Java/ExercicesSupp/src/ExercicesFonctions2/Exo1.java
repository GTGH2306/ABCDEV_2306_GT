package ExercicesFonctions2;
import java.util.Scanner;


public class Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez le nombre de paiement par Carte Bleue :");
		int cb = sc.nextInt();
		System.out.println("Saisissez le nombre de paiement par Chèque :");
		int cheque = sc.nextInt();
		System.out.println("Saisissez le nombre de paiement par Virement :");
		int vire = sc.nextInt();
		int total = cb + cheque + vire;
		
		System.out.println("Vous avez émis " + total + " ordre de débit dont : ");
		System.out.println(pourcentage(cb, total) + " % par Carte Bleue");
		System.out.println(pourcentage(cheque, total) + " % par Chèque");
		System.out.println(pourcentage(vire, total) + " % par Virement");
		
		sc.close();
		
	}
	
	private static double pourcentage(int nbr, int total) {
		double a = (double)nbr / total;
		double pourcent = Math.round((a * 100d) * 100) / 100d;
		return pourcent;
	}
}
