package enumCours;

public enum Personne {
	MICKAEL("Mickael", 36),
	FRANCK("Franck", 45),
	ADELINE("Adeline", 25),
	SOPHIE("Sophie", 28);
	
	private String prenom;
	private int age;
	
	Personne(String _prenom, int _age){
		this.setPrenom(_prenom);
		this.setAge(_age);
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void printPersonne(Personne _personne) {
		System.out.println("Prenom : " + _personne.getPrenom());
		System.out.println("Age : " + _personne.getAge());
	}
}
