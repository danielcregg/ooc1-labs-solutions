package ie.gmit.examsolutions.oldLabs.quiz;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
	
	private ArrayList<String> choices;

	public ChoiceQuestion() {
		choices = new ArrayList<String>();
	}
	
	/**
	 * Adds an answer choice to this question
	 * @param choice - the choice to add
	 * @param correct - true if this is the correct choice; false otherwise 
	 */
	public void addChoice(String choice, boolean correct){
		choices.add(choice);
		  if (correct)
		  {
		    // Convert choices.size() to string
		    String choiceString = "" + choices.size();
		    setAnswer(choiceString);
		  }
	}
	
	public void displayQuestion(){
		// Display the question text
		  super.displayQuestion(); // OK
		  // Display the answer choices
		  for (int i= 0; i < choices.size(); i++){
			  int choiceNumber = i + 1;
			  System.out.println(choiceNumber + ": " + choices.get(i));
		  }
	}
}
