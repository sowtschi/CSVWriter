package models;

/** 
 * Answer-Model
 * 
 * @author Steffen Benjamin Owtschinnikow
 * @version 1.0
 * @since 2019-06-06
 */

public class Answer {

	private int id;
	private String answer;

	public Answer(int id, String answer) {
		this.id = id;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	/*
	 * Return ID and answer as String-Array
	 * @return answerRow ID and answer as String-Array
	 * */

	public String[] getAnswerRow() {
		String[] answerRow = { Integer.toString(this.id), this.answer };
		return answerRow;
	}

}
