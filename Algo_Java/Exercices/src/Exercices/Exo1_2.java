package Exercices;
import java.util.Scanner;
import java.lang.Math;

public class Exo1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    float rayon;//Rayon : reel
	    double aire;//Aire : reel
	    double volume;//Volume : reel
		
	    Scanner scanner;
		scanner = new Scanner(System.in);
		
		
	    System.out.println("Saisissez le rayon de la sphere: ");//Ecrire "Saisissez le rayon de la sphère: "
	    rayon = scanner.nextFloat(); //Lire <-- Rayon
	    aire = 4*Math.PI*Math.pow(rayon, 2);//Aire <-- 4*π*Rayon^2
	    aire = Math.round(aire * 1000.0) / 1000.0;//Arrondi le résultat à la 3ème décimale
	    System.out.println("L'aire de la sphere est " + aire);//Ecrire "L'aire de la sphère est de: ", Aire
	    volume = (4/3)*Math.PI*Math.pow(rayon, 3);//Volume <-- (4/3)*8π*Rayon^3
	    volume = Math.round(volume * 1000.0) / 1000.0;//Arrondi le résultat à la 3ème décimale
	    System.out.println("Le volume de la sphere est " + volume);//Ecrire "Le volume de la sphère est de: ", Volume
		
		scanner.close();

	}

}
