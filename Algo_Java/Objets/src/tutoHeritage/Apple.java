package tutoHeritage;

public class Apple extends Fruit implements PeelFruit {
	
	public Apple() {
		super("Pomme"); //Fais appel au constructeur de la superclasse, lui donnant le param�tre "Pomme"
		peeled = false;
	}
	
	@Override
	public void taste() {
		System.out.println("La pomme est un fruit sucr�.");
		super.miam(); //Acc�s � la m�thode miam() de la superclasse.
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
