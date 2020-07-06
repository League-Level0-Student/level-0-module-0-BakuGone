package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot fred = new Robot();
		
		fred.penDown(); 
		fred.setSpeed(100);
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		for(int i = 1; i < 51; i++) {
				// Change the robot pen color to random
				fred.setRandomPenColor();
				// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop	
				fred.move(5*i);
			
				// TURN.    Turn the robot (360/7) degrees to the right
				fred.turn(360/7);
			
				// Change the robot pen width to (i)
				fred.setPenWidth(i);
		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
		}
		
	}
}
