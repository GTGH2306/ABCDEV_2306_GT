package Exos;
import java.util.Scanner;


public class Exo7 {

	public static void main(String[] args) {
		double pourcent1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez nombre de voies de Guignol 1:");
		int vote1 = sc.nextInt();
		System.out.println("Saisissez nombre de voies de Guignol 2:");
		int vote2 = sc.nextInt();
		System.out.println("Saisissez nombre de voies de Guignol 3:");
		int vote3 = sc.nextInt();
		System.out.println("Saisissez nombre de voies de Guignol 4:");
		int vote4 = sc.nextInt();
		String resultat;
		double total = vote1 + vote2 + vote3 + vote4;
		double pourcent2 = (vote2 / total) * 100d;
		pourcent2 = Math.round(pourcent2 * 100) / 100d;
		double pourcent3 = (vote3 / total) * 100d;
		pourcent3 = Math.round(pourcent3 * 100) / 100d;
		double pourcent4 = (vote4 / total) * 100d;
		pourcent4 = Math.round(pourcent4 * 100) / 100d;
		boolean battu;
		
		pourcent1 = (vote1 / total) * 100d;
		pourcent1 = Math.round(pourcent1 * 100) / 100d;
		
		if (pourcent2 > 50 || pourcent3 > 50 || pourcent4 > 50) {
			battu = true;
		} else {
			battu = false;
		}
		
		if (pourcent1 > 50) {
			resultat = "elu";
		} else if (pourcent1 >= 12.5 && !battu){
			if (vote1 > vote2 && vote1 > vote3 && vote1 > vote4) {
				resultat = "en ballotage favorable";
			} else {
				resultat = "en ballotage defavorable";
			}
		} else {
			resultat = "battu";
		}
		System.out.println("Guignol 1 est " + resultat + " avec " + pourcent1 +"% des voies.");
		System.out.println("Guignol 2 a " + pourcent2 + "% des voies.");
		System.out.println("Guignol 3 a " + pourcent3 + "% des voies.");
		System.out.println("Guignol 4 a " + pourcent4 + "% des voies.");
		sc.close();
	}

}
