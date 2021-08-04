package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	private static final 
	Robot rob = new Robot();
	public void run() {
		rob.penDown();
		rob.setSpeed(50);
		rob.turn(90);
		rob.move(1000);
		
		rob.setPenColor(Color.green);
	}
