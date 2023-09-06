package exercicePersonnes;

public class Personne {
	private String nom, prenom, adresse;
	private int age;
	
	public Personne(String _nom, String _prenom, int _age, String _adresse) {
		this.nom = _nom;
		this.prenom = _prenom;
		this.age = _age;
		this.adresse = _adresse;
	}
	
	public void infos() {
		System.out.println("------\nNom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Âge:  " + this.age);
		System.out.println("Adresse: " + this.adresse + "\n------");
	}
	
	public void comparerAge(Personne _test) {
		if (this.estPlusVieux(_test)) {
			System.out.println(this.prenom + " est plus vieux de " + (this.age - _test.getAge()) + " ans que " + _test.getPrenom() + ".");
		} else if(this.aMemeAge(_test)) {
			System.out.println(this.prenom + " et " + _test.getPrenom() + " on tout les deux " + this.age + " ans.");
		} else {
			System.out.println(_test.getPrenom() + " est plus vieux de " + (_test.getAge() - this.age) + " ans que " + this.prenom + ".");
		}
	}
	
	public boolean estPlusVieux(Personne _test) {
		if (this.age > _test.getAge()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean aMemeAge(Personne _test) {
		if (this.age == _test.getAge()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	//GETTERS
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public int getAge() {
		return this.age;
	}
	public String getAdresse() {
		return this.adresse;
	}
	
	//SETTERS
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	public void setPrenom(String _prenom) {
		this.prenom = _prenom;
	}
	public void setAge(int _age) {
		this.age = _age;
	}
	public void setAdresse(String _adresse) {
		this.adresse = _adresse;
	}
}
