package tutoHeritage;

public class Apple extends Fruit implements PeelFruit {
	
	public Apple() {
		super("Pomme"); //Fais appel au constructeur de la superclasse, lui donnant le paramêtre "Pomme"
		peeled = false;
	}
	
	@Override
	public void taste() {
		System.out.println("La pomme est un fruit sucré.");
		super.miam(); //Accès à la méthode miam() de la superclasse.
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSkinType() {
		return "Lisse";
	}
	

}
