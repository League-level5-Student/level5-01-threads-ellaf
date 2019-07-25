package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
public static void main(String[] args) {
	Robot speedy = new Robot(300, 600);
	speedy.setPenColor(Color.RED);
	speedy.penDown();
	Robot fastboi = new Robot(500, 600);
	fastboi.setPenColor(Color.GREEN);
	fastboi.penDown();
	Robot zoom = new Robot(700, 600);
	zoom.setPenColor(Color.YELLOW);
	zoom.penDown();
	Robot mildlyQuick = new Robot(900, 600);
	mildlyQuick.setPenColor(Color.CYAN);
	mildlyQuick.penDown();
	
	int randS = new Random().nextInt(10)+1;
	int randF = new Random().nextInt(10)+1;
	int randZ = new Random().nextInt(10)+1;
	int randMQ = new Random().nextInt(10)+1;
	
	speedy.setSpeed(randS);
	fastboi.setSpeed(randF);
	zoom.setSpeed(randZ);
	mildlyQuick.setSpeed(randMQ);
	
	Thread r1 = new Thread(()->speedy.move(400));
	Thread r2 = new Thread(()->fastboi.move(400));
	Thread r3 = new Thread(()->zoom.move(400));
	Thread r4 = new Thread(()->mildlyQuick.move(400));
	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	
	
	
	
}
}
