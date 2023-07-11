package Exos;
import java.util.Scanner;


public class Exo7 {

	public static void main(String[] args) {
		double pourcent;
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
		
		pourcent = (vote1 / total) * 100d;
		pourcent = Math.round(pourcent * 100) / 100d;
		
		if (pourcent > 50) {
			resultat = "elu";
		} else if (pourcent >= 12.5){
			if (vote1 > vote2 && vote1 > vote3 && vote1 > vote4) {
				resultat = "en ballotage favorable";
			} else {
				resultat = "en ballotage defavorable";
			}
		} else {
			resultat = "battu";
		}
		System.out.println("Guignol 1 est " + resultat + " avec " + pourcent +"% des voies.");
		sc.close();
	}

}
