package exerciceRecettes;

import java.util.ArrayList;

public class Plat {
	private String nom;
	private ArrayList<Ingredient> ingredients;
	
	public Plat(String _nom, ArrayList<Ingredient> _ingredients) {
		this.nom = _nom;
		this.ingredients = _ingredients;	
	}
	
	public Plat(String _nom) {
		this.nom = _nom;
		this.ingredients = new ArrayList<Ingredient>();
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public ArrayList<Ingredient> getIngredients(){
		return this.ingredients;
	}
	
	public void addIngredients(Ingredient _added) {
		ingredients.add(_added);
	}
	
	public boolean equals(Plat _test) {
		boolean isEqual = true;
		if (this.getIngredients().size() == _test.getIngredients().size()) {
			for (int i = 0; i < this.getIngredients().size(); i++) {
				if (!this.getIngredients().get(i).equals(_test.getIngredients().get(i))) {
					isEqual = false;
				}
			}
		} else {
			isEqual = false;
		}
		return isEqual;
	}
}
