package ie.gmit.examsolutions.oldLabs.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner userAnswer = new Scanner(System.in); 
		String storeResponse;
		
		Question q1 = new Question();
		q1.setText("Who was the inventor of Java?");
		q1.setAnswer("James Gosling");
		
		q1.displayQuestion();
		System.out.println("Enter your answer");
		storeResponse = userAnswer.nextLine();
		System.out.println(q1.checkAnswer(storeResponse));
		
		ChoiceQuestion q2 = new ChoiceQuestion();
		q2.setText("In which country was the inventor or Java born?");
		q2.addChoice("Ireland", false);
		q2.addChoice("England", false);
		q2.addChoice("Canada", true);
		q2.addChoice("United States", false);
		
		
		System.out.printf("\n");
		q2.displayQuestion();
		System.out.println("Please select a number: ");
		storeResponse = userAnswer.nextLine();
		System.out.println(q2.checkAnswer(storeResponse));
		
		userAnswer.close();
		
		//presentQuestion(q2);
	}
/*	
	public static void presentQuestion(ChoiceQuestion q){
		System.out.printf("\n");
		q.displayQuestion();
		System.out.println("Please select a number: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
		in.close();
	}
*/	
}
