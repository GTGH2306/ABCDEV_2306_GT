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
			new Poisson("Michel", Genre.MALE, Race.MEROU, (int)Math.floor((Math.random() * 15) + 1), 0),
			new Poisson("Face de Merou", Genre.MALE, Race.MEROU, (int)Math.floor((Math.random() * 15) + 1), 0),
			new Poisson("Louis", Genre.MALE, Race.CARPE, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Poële à frire", Genre.MALE, Race.CARPE, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Dori", Genre.FEMELLE, Race.SOLE, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Terminator", Genre.MALE, Race.SOLE, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Sushi", Genre.FEMELLE, Race.SOLE, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Nemo", Genre.MALE, Race.POISSONCLOWN, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Gardevoir", Genre.FEMELLE, Race.POISSONCLOWN, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("L'inquisitrice", Genre.MALE, Race.MEROU, (int)Math.floor((Math.random() * 15) + 1), 0),
			new Poisson("Saucisson", Genre.FEMELLE, Race.CARPE, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Bartaba", Genre.MALE, Race.BAR, (int)Math.floor((Math.random() * 15) + 1), 0),
			new Poisson("Diabolo", Genre.MALE, Race.BAR, (int)Math.floor((Math.random() * 15) + 1), 0),
			new Poisson("Optimus Prime", Genre.MALE, Race.BAR, (int)Math.floor((Math.random() * 15) + 1), 0),
			new Poisson("Gros Thon", Genre.MALE, Race.THON, (int)Math.floor((Math.random() * 4) + 1), 0),
			new Poisson("Biscotte", Genre.FEMELLE, Race.THON, (int)Math.floor((Math.random() * 4) + 1), 0)
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
		this(4);
	}
	
	
	public void tour(){
		tour ++;
		int sizePoissonsTour = this.poissons.size();
		int sizeAlguesTour = this.algues.size();
		
		for (int i = 0; i < sizePoissonsTour; i++) { //Remet les poissons à l'état "ne c'est pas reproduit" ce tour
			this.poissons.get(i).setReproduced(false);
		}
		System.out.println("----TOUR " + this.tour + "----");
		for (int i = 0; i < sizeAlguesTour; i++) { //Fais le comportement qu'on les algues à chaque tours
			if (this.algues.get(i).isAlive()) {
				this.algues.get(i).comportement();
			}
		}
		for (int i = 0; i < sizePoissonsTour; i++) { //Fais le comportement qu'on les poissons à chaque tours
			if (this.poissons.get(i).isAlive()) {
			this.poissons.get(i).comportement();
			}
		}
		for (int i = 0; i < this.poissons.size(); i++) { //Clear les poissons morts
			if (!this.poissons.get(i).isAlive()) {
				this.poissons.get(i).meurt();
				i--;
			}
		}
		for (int i = 0; i < this.algues.size(); i++) { //Clear les algues mortes
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
