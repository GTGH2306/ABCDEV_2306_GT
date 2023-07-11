package Exos;
import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double prix = 0;
		System.out.println("Saisissez le nombre de copies.");
		int copies = scan.nextInt();
		
		if (copies > 10) {
			copies -= 10;
			prix += 1d;
			if (copies > 10) {
				copies -= 10;
				prix += 0.9d;
				prix += copies * 0.08d;
			} else {
				prix += copies * 0.09d;
			}
		} else {
			prix = copies * 0.1d;
		}
		prix = Math.round(prix * 100) / 100d;
		System.out.println("Le prix est de " + prix + " euros.");
		scan.close();
	}

}
