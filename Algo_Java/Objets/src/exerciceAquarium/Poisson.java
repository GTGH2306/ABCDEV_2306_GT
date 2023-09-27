package exerciceAquarium;

public class Poisson extends Entity {
	
	
	
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
	public Race getRace() {
		return this.race;
	}
	
	
	public void manger(Entity _bouffe) {
		if ((this.race.isCarnivore() && _bouffe instanceof Poisson) || (this.race.isCarnivore() == false && _bouffe instanceof Algue)) {
			if (_bouffe instanceof Poisson) {
				System.out.println(this.getNom() + " mange " + _bouffe.getNom());
				_bouffe.getMaison().getPoissons().remove(_bouffe.getMaison().getPoissons().indexOf(_bouffe));
			} else {
				System.out.println(this.getNom() + " mange une " + _bouffe.getNom());
				_bouffe.getMaison().getAlgues().remove(_bouffe.getMaison().getAlgues().indexOf(_bouffe));
			}
		} else {
			System.out.println(this.getNom() + " ne peux pas manger " + _bouffe.getNom());
		}
	}
	
	@Override
	public void comportement() {
		int rdm;
		if (this.race.carnivore) {
			
		} else {
			rdm = (int) Math.floor(Math.random() * this.getMaison().getAlgues().size());
			this.getMaison().getAlgues();
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
