package exercicePersonnes;

public class Etudiant extends Personne {
	
	private String ecole, specialite;
	
	public Etudiant(Personne _base, String _ecole, String _specialite) {
		super(_base.getNom(), _base.getPrenom(), _base.getAge(), _base.getAdresse());
		this.ecole = _ecole;
		this.specialite = _specialite;
	}
	
	//GETTERS
	public String getEcole() {
		return this.ecole;
	}
	public String getSpecialite() {
		return specialite;
	}
	
	//SETTERS
	public void setEcole(String _ecole) {
		this.ecole = _ecole;
	}
	public void setSpecialite(String _specialite) {
		this.specialite = _specialite;
	}
}
