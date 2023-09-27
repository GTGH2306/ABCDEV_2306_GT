package exerciceAquarium;

public class Poisson extends Consommable {
	
	
	
	private Genre genre;
	private Race race;
	
	public Poisson(String _nom, Genre _genre, Race _race) {
		super(_nom);
		genre = _genre;
		race = _race;
	}
	
	public String toString() {
		return ("Nom: " + this.getNom() + "\tGenre: " + this.genre.getNom());
	}
	
	public Genre getGenre() {
		return this.genre;
	}
	
	
	public void manger(Consommable _bouffe) {
		if ((this.race.isCarnivore() && _bouffe instanceof Poisson) || (this.race.isCarnivore() == false && _bouffe instanceof Algue)) {
			System.out.println(this.getNom() + " mange " + _bouffe.getNom());
			if (_bouffe instanceof Poisson) {
				_bouffe.getMaison().getPoissons().remove(_bouffe.getMaison().getPoissons().indexOf(_bouffe));
			} else {
				_bouffe.getMaison().getAlgues().remove(_bouffe.getMaison().getAlgues().indexOf(_bouffe));
			}
		} else {
			System.out.println(this.getNom() + " ne peux pas manger " + _bouffe.getNom());
		}
	}
	
	
	
	
	
	
	//ENUMS
	
	public enum Genre{
		MALE("Mâle"),
		FEMELLE("Femelle");
		
		private String nom;
		
		private Genre(String _nom) {
			nom = _nom;
		}
		
		public String getNom(){
			return nom;
		}
	}
	
	public enum Race{
		MEROU("Mérou", true),
		THON("Thon", true),
		POISSONCLOWN("Poisson-Clown", true),
		SOLE("Sole", false),
		BAR("Bar", false),
		CARPE("Carpe", false);
		
		private String nom;
		private boolean carnivore;
		
		private Race(String _nom, boolean _carnivore) {
			nom = _nom;
			carnivore = _carnivore;
		}

		public String getNom() {
			return nom;
		}

		public boolean isCarnivore() {
			return carnivore;
		}
	}
}
