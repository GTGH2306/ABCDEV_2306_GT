package exercicePersonnes;

public class App {

	public static void main(String[] args) {
		Personne john = new Personne("Smith", "John", 44, "12 Rue des Peupliers");
		Personne billy = new Personne("Bob", "Billy", 8, "3 Avenue de la Chartreuse");
		Personne dodo = new Personne("Toto", "Dodo", 135, "7ème cercle de l'enfer");
		Etudiant pipo = new Etudiant(new Personne("Durand", "Pipo", 25, "11 Avenue du Pipo"), "Montparnasse", "");
		
		john.infos();
		billy.infos();
		dodo.infos();
		
		dodo.comparerAge(john);
		john.comparerAge(billy);
		billy.comparerAge(dodo);
		
	}

}
