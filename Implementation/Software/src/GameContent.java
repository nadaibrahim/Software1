

public class GameContent {  
  String question;

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}


}


class MCQContent extends GameContent 
{
    String [] answers= new String [4];
    boolean[] correct = new boolean [4];

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}

	public boolean[] getCorrect() {
		return correct;
	}

	public void setCorrect(boolean[] correct) {
		this.correct = correct;
	}


    
    
}

class TrueAndFalseContent extends GameContent
{

	boolean [] correct = new boolean[2];
	


	public boolean[] getCorrect() {
		return correct;
	}

	public void setCorrect(boolean[] correct) {
		this.correct = correct;
	}


		
}