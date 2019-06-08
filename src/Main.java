import java.util.ArrayList;

import models.Answer;
import models.Question;
import tools.CSVWriter;
import tools.StringArrayMerger;

/** 
 * Create some Test Data and write it to CSV-File.
 * 
 * @author Steffen Benjamin Owtschinnikow
 * @version 1.0
 * @since 2019-06-06
 */

public class Main {

	private static String[] headerNames = new String[4];
	public static ArrayList<Answer> answers = new ArrayList<Answer>();
	public static ArrayList<Question> questions = new ArrayList<Question>();
	private static CSVWriter csvWriter;

	public static void main(String[] args) {

		createTestData();

		csvWriter = new CSVWriter("awnsersAndQuestions.csv", headerNames);

		writeQuestionAndAnswers(answers, questions);

		csvWriter.flush();

		csvWriter.close();

	}
	
	
	/*
	 * Write a row of "answer" and "question" objects for CSV-writer. 
	 * Check if object-containers are empty. 
	 * @return nothing.
	 * @param args Parameter des Users beim Programmstart.
	 * */
	
	public static void writeQuestionAndAnswers(ArrayList<Answer> answers, ArrayList<Question> questions) {
		for (int i = 0; i < answers.size() + questions.size(); i++) {
			if (i < answers.size() && i < questions.size()) {
				csvWriter.writeRow(StringArrayMerger.
						mergeStringArrays(questions.get(i).getQuestionRow(), answers.get(i).getAnswerRow()));
			} else if (i < answers.size()) {
				csvWriter.writeRow(answers.get(i).getAnswerRow());
			} else if (i < questions.size()) {
				csvWriter.writeRow(questions.get(i).getQuestionRow());
			} else { // no Element left
				break;
			}
		}
	}

	public static void createTestData() {
		headerNames[0] = "a_id";
		headerNames[1] = "awnser";
		headerNames[2] = "q_id";
		headerNames[3] = "question";

		answers.add(new Answer(0, "This is not good"));
		answers.add(new Answer(1, "This is good"));
		answers.add(new Answer(2, "Perfect!"));
		answers.add(new Answer(3, "Perfect!"));

		questions.add(new Question(0, "What about?"));
		questions.add(new Question(1, "What you think?"));
		questions.add(new Question(2, "How are you?"));
	}

}
