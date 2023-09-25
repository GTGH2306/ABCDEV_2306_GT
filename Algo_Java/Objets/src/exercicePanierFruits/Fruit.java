package exercicePanierFruits;

public class Fruit {
	private String label;
	private double price;
	
	public Fruit(String _label, double _price) {
		this.label = _label;
		this.price = _price;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double _price) {
		this.price = _price;
	}

}
