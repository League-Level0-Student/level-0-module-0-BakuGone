package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static int score = 0;
	
	public static void correctAnswer() {
		
		score += 1;
		JOptionPane.showMessageDialog(null, "That answer is correct!");
		
	}
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		// ASK A QUESTION AND CHECK THE ANSWER

				// 2.  Ask the user a question 
		String questionOne = JOptionPane.showInputDialog("What is 2+ 2?");
				// 3.  Use an if statement to check if their answer is correct
		if (questionOne == "4") {
				// 4.  if the user's answer was correct, add one to their score 
			correctAnswer();
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "That answer is incorrect.");
		}

		String questionTwo = JOptionPane.showInputDialog("What is -2+ -2?");
		
		if (questionTwo == "-4") {
			correctAnswer();
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "That answer is incorrect.");
		}
		
		JOptionPane.showMessageDialog(null, "Your final score is " + score);
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
