package jalon_algo_niveau2_GT;
import java.util.Scanner;

public class Jalon_algo_niveau2_GT {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String etudiant;
		String jour;
		boolean saisieinvalide = true;
		boolean jourinvalide = true;
		
		while (saisieinvalide == true) { 											//Tant que saisie est invalide
			System.out.println("Etes-vous etudiant ?\n(O ou o pour \"oui\") \t(N ou n pour \"non\") "); //Demande saisie
			etudiant = sc.next();
				if (etudiant.equals("O") || etudiant.equals("o")) {							//Si Etudiant
					saisieinvalide = false;
					while (jourinvalide == true) {									//Tant que jour invalide
						System.out.println("Saisissez le jour: ");					//Demande saisie
						jour = sc.next();
						if (jour.equals("jeudi") || jour.equals("Jeudi")) { 				//Si Jeudi
							System.out.println("Vous avez une reduction de 20%");
							jourinvalide = false;
							
						} else if (jour.equals("mercredi") || jour.equals("Mercredi")) { 	//Sinon Si Mercredi
							System.out.println("Vous avez une reduction de 50%");
							jourinvalide = false;
							
						} else if (jour.equals("lundi") || jour.equals("Lundi")) { 			//Sinon Si Lundi
							System.out.println("Vous n'avez pas de reduction le Lundi.");
							jourinvalide = false;
							
						} else if (jour.equals("mardi") || jour.equals("Mardi")) { 			//Sinon Si Mardi
							System.out.println("Vous n'avez pas de reduction le Mardi.");
							jourinvalide = false;
							
						} else if (jour.equals("vendredi") || jour.equals("Vendredi")) {	 //Sinon Si Vendredi
							System.out.println("Vous n'avez pas de reduction le Vendredi.");
							jourinvalide = false;
							
						} else if (jour.equals("samedi") || jour.equals("Samedi")) { 		//Sinon Si Samedi
							System.out.println("Vous n'avez pas de reduction le Samedi.");
							jourinvalide = false;
							
						} else if (jour.equals("dimanche") || jour.equals("Dimanche")) { 	//Sinon Si Dimanche
							System.out.println("Vous n'avez pas de reduction le Dimanche.");
							jourinvalide = false;
						} else {															//Sinon Jour invalide
							System.out.println("Merci de saisir un jour de la semaine.");
							jourinvalide = true;
						}
					}
				} else if (etudiant.equals("N") || etudiant.equals("n")) {					//Sinon Si Pas etudiant
					System.out.println("Vous n'avez pas de reduction.");
					saisieinvalide = false;
				} else {																	//Sinon Saisie invalide
					System.out.println("Saisie invalide, merci de saisir O ou N.");
					saisieinvalide = true;
				}
			}
		sc.close();
	}
}
