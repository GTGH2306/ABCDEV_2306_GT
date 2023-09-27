package exerciceAquarium;

import java.util.ArrayList;

public class Aquarium {
	
	private ArrayList<Poisson> poissons;
	private ArrayList<Algue> algues;
	private int tour = 0;
	
	public Aquarium(ArrayList<Poisson> _poissons, ArrayList<Algue> _algues) {
		poissons = new ArrayList<Poisson>(_poissons);
		algues = new ArrayList<Algue>(_algues);
		for (int i = 0; i < poissons.size(); i++) {
			poissons.get(i).setMaison(this);;
		}
		for (int i = 0; i < algues.size(); i++) {
			algues.get(i).setMaison(this);;
		}
	}
	
	public void tour(){
		tour ++;
		System.out.println("----TOUR " + this.tour + "----");
		afficherInfos();
	}
	
	public void afficherInfos() {
		System.out.println("Poissons: ");
		for (int i = 0; i < this.poissons.size(); i++) {
			System.out.println((i + 1) + ". " + this.poissons.get(i));
		}
		System.out.println("Algues: " + this.algues.size());
	}
	
	public ArrayList<Poisson> getPoissons() {
		return this.poissons;
	}
	public ArrayList<Algue> getAlgues(){
		return this.algues;
	}
	
}
