package tutoPolymorphisme;

public class App {

	public static void main(String[] args) {
		
		//Je ne pourrais pas mettre ship est glider dans le même tableau si leur classe mère n'était pas abstraite.
		
		Vehicle[] someVehicles = new Vehicle[3];
		someVehicles[0] = new Ship();
		someVehicles[1] = new Ship();
		someVehicles[2] = new Glider();
		
		Building[] someBuildings = new Building[2];
		someBuildings[0] = new Cottage();
		someBuildings[1] = new Cottage();
		
		Flyable[] elements = {new Cottage(), new Cottage(), new Glider()};
			
		someVehicles[0].moveXY(88, 66);
		someVehicles[2].moveXY(22, 33);
		
		/*
		someVehicles[2].fly("Gasole");
		someBuildings[0].fly("Magie");
		someBuildings[1].fly("Magie");
		*/
	
		for (Flyable e : elements) {
			e.fly("Gasole");
		}
	}
}
