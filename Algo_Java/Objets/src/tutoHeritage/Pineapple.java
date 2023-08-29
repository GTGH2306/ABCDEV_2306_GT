package tutoHeritage;

public class Pineapple extends Fruit implements PeelFruit {

	public Pineapple() {
		super("Ananas"); //Fais appel au constructeur de la superclasse, lui donnant le paramêtre "Pomme"
	}

	@Override
	public void taste() {
		System.out.println("L'Ananas est un fruit légèrement acide.");
		super.miam(); //Accès à la méthode miam() de la superclasse.

	}

	@Override
	public int getSize() {
		return 4;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSkinType() {
		return "Piquante";
	}

}
