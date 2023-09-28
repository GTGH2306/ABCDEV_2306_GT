package exerciceAquarium;

import java.util.ArrayList;
import java.util.Arrays;

import exerciceAquarium.Poisson.Genre;
import exerciceAquarium.Poisson.Race;

public class Aquarium {
	
	private ArrayList<Poisson> poissons;
	private ArrayList<Algue> algues;
	private int tour = 0;
	//Liste de poissons par défaut
	private static ArrayList<Poisson> defautPoissons = new ArrayList<Poisson>(Arrays.asList(
			new Poisson("Michel", Genre.MALE, Race.MEROU, (int)Math.floor((Math.random() * 4) + 1)),
			new Poisson("Louis", Genre.MALE, Race.CARPE, (int)Math.floor((Math.random() * 4) + 1)),
			new Poisson("Dori", Genre.FEMELLE, Race.SOLE, (int)Math.floor((Math.random() * 4) + 1)),
			new Poisson("Florent", Genre.MALE, Race.POISSONCLOWN, (int)Math.floor((Math.random() * 4) + 1)),
			new Poisson("L'inquisitrice", Genre.FEMELLE, Race.MEROU, (int)Math.floor((Math.random() * 4) + 1)),
			new Poisson("Saucisson", Genre.FEMELLE, Race.CARPE, (int)Math.floor((Math.random() * 4) + 1)),
			new Poisson("Bartaba", Genre.MALE, Race.BAR, (int)Math.floor((Math.random() * 4) + 1))
			));
	
	
	public Aquarium(ArrayList<Poisson> _poissons, int _nbAlgues) {
		poissons = new ArrayList<Poisson>(_poissons);
		algues = new ArrayList<Algue>();
		for (int i = 0; i < _nbAlgues; i++){
			int rdm = (int)Math.floor((Math.random() * 4) + 1);
			algues.add(new Algue(rdm));
		}
		for (int i = 0; i < poissons.size(); i++) {
			poissons.get(i).setMaison(this);;
		}
		for (int i = 0; i < algues.size(); i++) {
			algues.get(i).setMaison(this);;
		}
	}
	
	public Aquarium(int _nbAlgues) {
		this(defautPoissons, _nbAlgues);
	}
	public Aquarium() {
		this(8);
	}
	
	public void tour(){
		tour ++;
		System.out.println("----TOUR " + this.tour + "----");
		for (int i = 0; i < this.algues.size(); i++) {
			if (this.algues.get(i).isAlive()) {
				this.algues.get(i).comportement();
			}
		}
		for (int i = 0; i < this.poissons.size(); i++) {
			if (this.poissons.get(i).isAlive()) {
			this.poissons.get(i).comportement();
			}
		}
		for (int i = 0; i < this.poissons.size(); i++) {
			if (!this.poissons.get(i).isAlive()) {
				this.poissons.get(i).meurt();
				i--;
			}
		}
		for (int i = 0; i < this.algues.size(); i++) {
			if (!this.algues.get(i).isAlive()) {
				this.algues.get(i).meurt();
				i--;
			}
		}
		
		//afficherInfos();
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
	
	public int getTour() {
		return this.tour;
	}
	
}
