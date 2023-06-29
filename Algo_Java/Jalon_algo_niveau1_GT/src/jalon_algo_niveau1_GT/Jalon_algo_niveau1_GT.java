package jalon_algo_niveau1_GT;
import java.util.Scanner;

public class Jalon_algo_niveau1_GT {
	public static void main (String[] args) {
		String nom;
		String prenom;
		int departement;
		String domaine = "arfp.asso.fr";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez votre nom:");
		nom = sc.next();
		System.out.println("Saisissez votre prenom:");
		prenom = sc.next();
		System.out.println("Saisissez votre numero de departement:");
		departement = sc.nextInt();
		
		System.out.println(prenom + "." + nom + departement + "@" + domaine);
		System.out.println(nom + departement + prenom  + "@" + domaine);
		
		sc.close();
		
	}

}
