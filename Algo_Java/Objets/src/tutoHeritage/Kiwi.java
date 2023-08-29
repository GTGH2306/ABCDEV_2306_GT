package tutoHeritage;

public class Kiwi extends Fruit implements PeelFruit{

	public Kiwi() {
		super("Kiwi");
	}

	@Override
	public void taste() {
		System.out.println("Le goût est plutôt sucré.");
	}

	@Override
	public int getSize() {
		return 2;
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
		return "Doux";
	}

}
