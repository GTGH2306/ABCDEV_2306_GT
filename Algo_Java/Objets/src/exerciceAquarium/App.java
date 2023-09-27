package exerciceAquarium;

import java.util.ArrayList;

import exerciceAquarium.Poisson.Genre;
import exerciceAquarium.Poisson.Race;

public class App {

	public static void main(String[] args) {
		ArrayList<Poisson> poissons = new ArrayList<Poisson>();
		poissons.add(new Poisson("Michel", Genre.MALE, Race.MEROU));
		poissons.add(new Poisson("Louis", Genre.MALE, Race.CARPE));
		poissons.add(new Poisson("Dori", Genre.FEMELLE, Race.SOLE));
		poissons.add(new Poisson("L'inquisitrice", Genre.FEMELLE, Race.MEROU));
		
		ArrayList<Algue> algues = new ArrayList<Algue>();
		algues.add(new Algue());
		algues.add(new Algue());
		algues.add(new Algue());
		algues.add(new Algue());
		algues.add(new Algue());
		algues.add(new Algue());
		
		Aquarium joyeuxVille = new Aquarium(poissons, algues);
		
		joyeuxVille.tour();
		joyeuxVille.getPoissons().get(3).manger(joyeuxVille.getPoissons().get(1));
		joyeuxVille.getPoissons().get(2).manger(joyeuxVille.getAlgues().get(1));
		joyeuxVille.getPoissons().get(1).manger(joyeuxVille.getAlgues().get(1));
		joyeuxVille.tour();

	}
}
