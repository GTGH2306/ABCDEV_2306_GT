package exerciceSujetExamen;

public class App {

	public static void main(String[] args) {
		QuestionChoixMultiples q = new QuestionChoixMultiples("Qu'est-ce qui coula le Titanic?");
		q.setAnswer("Un IceBerg");
		q.setFakes("De la laitue Iceberg", "Leonardo Di Carpacio");
		for (String e : q.ordreRdm()) {
			System.out.println(e);
		}
	}

}
