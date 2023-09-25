package exerciceHierarchie2;

public class App {

	public static void main(String[] args) {
		Abeille bee = new Abeille();
		bee.seDeplacer();
		bee.manger();
		bee.bourdonner();
		
		Chien milou = new Chien("Yorkshire", "Milou");
		milou.manger();
		milou.seDeplacer();
		
		Labrador rufus = new Labrador("Rufus");
		rufus.manger();
		rufus.seDeplacer();
		
		Pinscher coco = new Pinscher("Coco");
		coco.manger();
		coco.seDeplacer();
		
		Herbivore vache = new Herbivore("Vache");
		vache.manger();
		vache.seDeplacer();
		
		Cheval cheval = new Cheval();
		cheval.manger();
		cheval.seDeplacer();
		
		Girafe girafe = new Girafe();
		girafe.manger();
		girafe.seDeplacer();
		
	}

}
