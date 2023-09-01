package exerciceRecettes;

public class App {

	public static void main(String[] args) {
		Plat choucroute = new Plat("Choucroute");
		choucroute.addIngredients(new Ingredient("choucroute", "cuite", 500, "gr", 80));
		choucroute.addIngredients(new Ingredient("lard", "cuit et entier", 150, "gr", 90));
		choucroute.addIngredients(new Ingredient("saucisses", "cuite et entière", 2, "entières", 90));
		
		Plat choux2 = new Plat("Chou");
		choux2.addIngredients(new Ingredient("choucroute", "cuite", 50, "g", 80));
		choux2.addIngredients(new Ingredient("lard", "cuit et entier", 10, "g", 90));
		choux2.addIngredients(new Ingredient("saucisses", "cuite et entière", 1, "entières", 90));
		
		boolean test1 = choucroute.equals(choux2); 
		System.out.println(test1);
	}
}
