package exerciceSujetExamen;

public class Question {
	public String enonce;
	public int difficulte=50; // la difficulte varie de 0 à 100
		
	public Question(String e){
			this.enonce = e;
	}
	
	public void setDifficulte(int d){
		this.difficulte = d;
	}
	
	public int getDifficulte(){
		return this.difficulte;
	}
	
	public String getEnonce(){
		return this.enonce;
	}

}
