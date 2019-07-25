package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
	public static void main(String[] args) {
		
		//diameter = 230px w 20px spacing
		Robot jonathan = new Robot(450,200);
		Robot ronathan = new Robot(700, 200);
		Robot donathan = new Robot(950, 200);
		Robot timothy = new Robot(575, 350);
		Robot jimothy = new Robot(825, 350);
		jonathan.penDown();
		ronathan.penDown();
		donathan.penDown();
		timothy.penDown();
		jimothy.penDown();
		jonathan.setPenColor(Color.BLUE);
		jonathan.setPenWidth(5);
		ronathan.setPenColor(Color.BLACK);
		ronathan.setPenWidth(5);
		donathan.setPenColor(Color.RED);
		donathan.setPenWidth(5);
		timothy.setPenColor(Color.YELLOW);
		timothy.setPenWidth(5);
		jimothy.setPenColor(Color.GREEN);
		jimothy.setPenWidth(5);


		Thread r1 = new Thread(()->makeCircle(jonathan));
		Thread r2 = new Thread(()->makeCircle(ronathan));
		Thread r3 = new Thread(()->makeCircle(donathan));
		Thread r4 = new Thread(()->makeCircle(timothy));
		Thread r5 = new Thread(()->makeCircle(jimothy));
	
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();


		
		
	}
	
	public static void makeCircle(Robot r) {
	r.setSpeed(10);
	for (int i = 0; i < 360; i++) {
	r.move(2);
	r.turn(1);
	}
		
	}
}

