package exempleVille;

public class App {
	public static void main(String[] args) {
		Ville ville1 = new Ville();
		Ville ville2 = new Ville("Paris", "France", 123789);
		Ville ville3 = new Ville("Moscou", "Russie", 985613);
		
		System.out.println("La ville " + ville1.getNomVille() + " est en " + ville1.getNomPays() + " et a " + ville1.getNbHabitant() + " habitants.");
		System.out.println("La ville " + ville2.getNomVille() + " est en " + ville2.getNomPays() + " et a " + ville2.getNbHabitant() + " habitants.");
		System.out.println("La ville " + ville3.getNomVille() + " est en " + ville3.getNomPays() + " et a " + ville3.getNbHabitant() + " habitants.");
	}
}
