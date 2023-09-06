package exerciceSujetExamen;

import java.util.ArrayList;

public class Sujet {
	private ArrayList<Question> questions;
	private double diffMoyenne;
	
	public Sujet(ArrayList<Question> _questions) {
		this.questions = _questions;
		for (Question q : this.questions) {
			this.diffMoyenne += q.difficulte;
		}
		this.diffMoyenne /= this.questions.size();
	}
	
	public double getDiffMoyenne() {
		return this.diffMoyenne;
	}
	
	
}
