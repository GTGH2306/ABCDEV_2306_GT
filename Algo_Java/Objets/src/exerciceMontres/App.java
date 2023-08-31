package exerciceMontres;

public class App {

	public static void main(String[] args) {
		Personne michel = new Personne("Michel");
		Personne bob = new Personne("Bob");
		
		Montre picsou = new Montre(23, 58);
		Montre rolex = new Montre(picsou.getHeure());
		
		bob.donnerMontre(picsou);
		bob.direHeure();
		
		bob.getMontre().avancer();
		bob.direHeure();
		bob.getMontre().avancer();
		bob.direHeure();
		bob.getMontre().avancer();
		bob.direHeure();
		
		michel.donnerMontre(picsou);
		bob.prendreMontre(picsou);
		michel.donnerMontre(rolex);
		michel.donnerMontre(picsou);
		michel.direHeure();
	}
}
