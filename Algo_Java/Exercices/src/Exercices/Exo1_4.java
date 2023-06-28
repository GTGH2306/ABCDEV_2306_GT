package Exercices;
import java.util.Scanner;
import java.lang.Math;

public class Exo1_4 {
	public static void main(String args[]){
		
		float somme;
		float annees;
		float interet;
		double resultat;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("Entrez la somme placee: ");
		somme = scanner.nextFloat();
		System.out.println("Entrez le nombre d'annees de placement: ");
		annees = scanner.nextFloat();
		System.out.println("Entrez le taux d'interet en pourcents: ");
		interet = scanner.nextFloat();
		interet /= 100;
		resultat = somme * (1 + interet * annees);
		resultat = Math.round(resultat * 100.0) / 100.0;
		System.out.println("La somme gagnee serait de " + resultat + " euros pour un taux d'interet simple.");
		resultat = somme * Math.pow((1 + interet), annees);
		resultat = Math.round(resultat * 100.0) / 100.0;
		System.out.println("La somme gagnee serait de " + resultat + " euros pour un taux d'interet compose.");
		
		scanner.close();
	}
}
