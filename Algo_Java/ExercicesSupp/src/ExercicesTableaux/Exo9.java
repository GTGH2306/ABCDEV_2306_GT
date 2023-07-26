package ExercicesTableaux;
import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notes;
		double sommeNotes = 0;
		double moyenne;
		int nbrNotes;
		int intello = 0;
		
		
		System.out.println("Saisissez le nombre d'eleves : ");
		nbrNotes = sc.nextInt();
		notes = new double[nbrNotes];
		
		for (int i = 0; i < notes.length; i++) {
			System.out.println("Saisissez la note de l'eleve " + (i+1) + " : ");
			notes[i] = Math.round(sc.nextDouble() * 100) / 100d;
			
			if (notes[i] < 0 || notes[i] > 20) {
				System.out.println("Saisie invalide.");
				i--;
			} else {
				sommeNotes += notes[i];
			}
			
		}
		moyenne = Math.round((sommeNotes / nbrNotes) * 100) / 100d;
		
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] > moyenne) {
				intello ++;
			}
		}
		
		System.out.println("La moyenne est de " + moyenne + " .\nIl y'a " + intello + " intellos dans votre classe.");
		sc.close();
		
	}

}
