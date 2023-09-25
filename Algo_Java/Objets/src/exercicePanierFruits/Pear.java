package exercicePanierFruits;

public class Pear extends Fruit {
	private String color;
	
	public Pear(String _label, double _price, String _color) {
		super(_label, _price);
		color = _color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String _color) {
		this.color = _color;
	}

}
