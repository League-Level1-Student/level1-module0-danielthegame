package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {
		rob.setX(50);
		rob.setY(450);
		rob.penDown();
		rob.setSpeed(50);
		rob.turn(90);
		for (int i = 0; i < 10; i++) {
			int h = new Random().nextInt(3);
			if (h == 0) {
				drawhouse("small");
			}
			if (h ==1) {
				drawhouse("medium");
			
			}
			if (h==2) {
				drawhouse("large");
			}
		}

	}

	public void drawhouse(String height) {

		rob.setPenColor(Color.green);
		rob.move(20);
		rob.setPenColor(Color.black);
		rob.turn(-90);
		if (height.equals("small")) {

			rob.move(60);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(60);
		}
		if (height.equals("medium")) {
			rob.move(100);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(100);
		}
		
		if (height.equals("large")) {
			rob.move(200);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(200);
		}
		rob.turn(-90);
	}

	public void flatroof() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);	
		}
}
