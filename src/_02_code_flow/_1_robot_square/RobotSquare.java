package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	
    public static void main(String[] args){
 
    	// This code makes a new Robot
    	Robot rob = new Robot();
    	
    	rob.penDown();
    	rob.setSpeed(10);

        for (int i = 1; i < 5; i++) {
        	rob.move(100);
        	rob.turn(90);
    	
        }
    }
}
