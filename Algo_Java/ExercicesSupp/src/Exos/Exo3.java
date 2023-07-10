package Exos;
import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisissez l'age de l'enfant :");
		int age = scan.nextInt();
		String groupe;
		
		if (age <= 0 ) {
			groupe = "pas ne";
		} else if (age <= 5) {
			groupe = "trop jeune";
		} else if (age > 5 && age < 8){
			groupe = "Poussin";
		} else if (age > 7 && age < 10) {
			groupe = "Pupille";
		} else if (age > 9 && age < 12) {
			groupe = "Minime";
		} else {
			groupe = "Cadet";
		}
		
		System.out.println("L'enfant est " + groupe);
		scan.close();
	}

}
