package exerciceCompteBanque;

public class TestCompte {

	public static void main(String[] args) {
		Compte compte1 = new Compte(500);
		
		compte1.afficher();
		compte1.deposer(25);
		compte1.afficher();
		compte1.retirer(186);
		compte1.afficher();
	}

}
