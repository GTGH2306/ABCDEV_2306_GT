package exercicePanierFruits;

public class Apple extends Fruit {
	private boolean redLabel;
	
	public Apple(String _label, double _price, boolean _redLabel) {
		super(_label, _price);
		redLabel = _redLabel;
	}
	
	public boolean isRedLabel() {
		return this.redLabel;
	}
}
