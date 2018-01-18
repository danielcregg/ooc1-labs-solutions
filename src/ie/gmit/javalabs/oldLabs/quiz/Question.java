package ie.gmit.javalabs.oldLabs.quiz;


public class Question {
	// A question has two strings. One is the Question the other is the answer.
	private String text;
	private String answer;
	
	/* Constructor */
	public Question()
	{
		text = "";
		answer = "";
	}
	
	/* Second Constructor with two parameters */
	public Question(String questionText, String answerTest)
	{
		text = questionText;
		answer = answerTest;
	}
	
	// Setters
	public void setText(String questionText){
		text = questionText;
	}
	
	public void setAnswer(String answerText){
		answer = answerText;
	}
	
	/**
	 * Display this question
	*/
	public void displayQuestion(){
		System.out.println(text);
	}
	
	/**
	 * Checks a response input for correctness
	 * @param the response from user that must be checked
	 * @return true if response matches answer and false if it does not.
	 */
	public boolean checkAnswer(String response){
		return response.equals(answer);
	}
	
}

