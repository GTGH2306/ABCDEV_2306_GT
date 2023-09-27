package exerciceAquarium;

public class App {

	public static void main(String[] args) {		
		Aquarium joyeuxVille = new Aquarium(6);
		
		joyeuxVille.tour();
		joyeuxVille.getPoissons().get(3).manger(joyeuxVille.getPoissons().get(1));
		joyeuxVille.getPoissons().get(2).manger(joyeuxVille.getAlgues().get(1));
		joyeuxVille.getPoissons().get(1).manger(joyeuxVille.getAlgues().get(1));
		joyeuxVille.tour();

	}
}
