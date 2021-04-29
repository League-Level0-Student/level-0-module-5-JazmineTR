package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	public static void main(String[] args) {
		String shape =JOptionPane.showInputDialog("What shape would you like the robot to draw? Circle, Triangle, or Square");
		if(shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		if(shape.equalsIgnoreCase("square")) {
			drawSquare();
		}
	}
	 static void drawSquare() {
		Robot rob = new Robot();
		rob.show();
		rob.penDown();
	for(int i =0;i<4;i++) {
		rob.move(100);
		rob.turn(90);
	}
	rob.hide();
}
	 static void drawTriangle() {
		Robot rob = new Robot();
		rob.show();
		rob.penDown();
	for(int i = 0; i<3;i++) {
		rob.move(110);
		rob.turn(120);
	}
	rob.hide();
	}
	static void drawCircle() {
		Robot rob = new Robot();	
		rob.show();
		rob.penDown();
		rob.setSpeed(100);
		for(int i=0;i<180;i++) {
	    rob.move(5);
		rob.turn(2);	
		}
		rob.hide();
		}
		
	}
	
	

