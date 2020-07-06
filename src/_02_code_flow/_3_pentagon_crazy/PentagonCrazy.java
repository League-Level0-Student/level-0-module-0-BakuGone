package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	private void drawPattern() {
		
		//  Create a new Robot
		Robot fred = new Robot();
		//  Put the robot's pen down
		fred.penDown();

		//  SPEED. Make the robot go at maximum speed (100)
		fred.setSpeed(100);

		//  COLOR. Set the pen to a color that you like for the shape
		fred.setPenColor(225, 192, 203);
		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape has.
		//  				(Hint: its called PentagonCrazy)
		int sides = 5;
		//  TURN ANGLE. Make another int variable for the angle you want the robot to turn. 
		//  			Hint: Divide 360 by the number of sides the shape has.
		int turnAngle = 360/sides;
		//  LOOP. Use a for loop to repeat ALL the following lines of code 200 times. 
		for(int i = 1; i < 201; i++) {
				//  DRAW.  Make the robot move "i" pixels
				//         "i" is the variable in the for loop
				fred.move(i);
				//  TURN.  Turn the robot the amount in your angle variable + 1
				fred.turn(turnAngle + 1);
		}

		// Hide the robot so you can see the pattern.
		fred.hide();
		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		}
	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	
	public static void main(String[] args) {
		new PentagonCrazy().drawPattern();
	}
}
