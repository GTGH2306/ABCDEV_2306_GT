package Exercices;
import java.util.Scanner;
import java.lang.Math;

public class Exo1_3 {
	public static void main(String args[]) {
		//VARIABLE
	    float rayon;//Rayon : reel
	    float angle;//Angle : reel
	    double aire;//Aire : reel

	    Scanner scanner;
	    scanner = new Scanner(System.in);
	    
	    System.out.println("Saisissez le rayon du cercle: ");//Ecrire "Saisissez le rayon du cercle: "
	    rayon = scanner.nextFloat(); //Lire <-- Rayon
	    System.out.println("Saisissez l'angle du secteur: ");//Ecrire "Saisissez l'angle du secteur: "
	    angle = scanner.nextFloat();//Lire <-- Angle
	    aire = (Math.PI * Math.pow(rayon, 2) * angle) / 360;//Aire <-- (π*Rayon^2*Angle)/360
	    aire = Math.round(aire * 1000.0) / 1000.0;
	    System.out.println("L'aire du secteur est de: " + aire);//Ecrire "L'aire du secteur est de: ", Aire
	    
	    scanner.close();
		
	}
}
