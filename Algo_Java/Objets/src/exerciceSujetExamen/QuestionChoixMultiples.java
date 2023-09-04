package exerciceSujetExamen;

public class QuestionChoixMultiples extends Question {
	private String answer, fake1, fake2;
	
	public QuestionChoixMultiples(String e) {
		super(e);
	}
	
	public void setAnswer(String _answer) {
		this.answer = _answer;
	}
	
	public void setFakes(String _fake1, String _fake2) {
		this.fake1 = _fake1;
		this.fake2 = _fake2;
	}
	
	public String[] ordreRdm() {
		String[] retour = {"UNDEFINED", "UNDEFINED", "UNDEFINED"};
		int rdm;
		int state = 0;
		
		do {
			rdm = (int)Math.floor(Math.random() * 3);
			if (retour[rdm].equals("UNDEFINED") && !retour[rdm].equals(answer) && !retour[rdm].equals(fake1) && !retour[rdm].equals(fake2)) {
				switch (state){
				default:
					retour[rdm] = answer;
					state ++;
					break;
				case 1:
					retour[rdm] = fake1;
					state ++;
					break;
				case 2:
					retour[rdm] = fake2;
					state ++;
					break;
				}
			}
			
		} while (state != 3);
		return retour;
	}
}
