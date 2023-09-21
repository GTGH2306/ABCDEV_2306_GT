package exempleVille;

public class App {
	public static void main(String[] args) {
		Ville ville1 = new Ville();
		Ville ville2 = new Ville("Champagney", "France", 37);
		Ville ville3 = new Ville("Moscou", "Russie", 985613);
		Capitale capitale1 = new Capitale();
		Capitale capitale2 = new Capitale("Paris", "France", 123785, "la Tour Eiffel");
		
		ville1.decrisToi();
		ville2.decrisToi();
		ville3.decrisToi();
		capitale1.decrisToi();
		capitale2.decrisToi();
		
		System.out.println(Ville.nbInstances);
	}
}
