package models;

/** 
 * Question-Model 
 * 
 * @author Steffen Benjamin Owtschinnikow
 * @version 1.0
 * @since 2019-06-06
 */

public class Question {

	private int id;
	private String question;

	public Question(int id, String question) {
		this.id = id;
		this.question = question;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getquestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	/*
	 * Return ID and question as String-Array
	 * @return questionRow ID and question as String-Array
	 * */

	public String[] getQuestionRow() {
		String[] questionRow = { Integer.toString(this.id), this.question };
		return questionRow;
	}
}
