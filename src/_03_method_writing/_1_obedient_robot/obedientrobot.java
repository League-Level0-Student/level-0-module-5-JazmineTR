package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	public static void main(String[] args) {
		String shape =JOptionPane.showInputDialog("What shape would you like the robot to draw? Circle, Triangle, or Square");
		String color = JOptionPane.showInputDialog("What color would you like? Blue, Red, or Green?");
		Color felt = Color.black;
		if(color.equalsIgnoreCase("Blue")) {
			felt = Color.blue;
		}
		else if(color.equalsIgnoreCase("Red")) {
			felt = Color.red;
		}
		else if(color.equalsIgnoreCase("Green")) {
			felt = Color.green;
		}
		if(shape.equalsIgnoreCase("circle")) {
			drawCircle(felt);
		}
		if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle(felt);
		}
		if(shape.equalsIgnoreCase("square")) {
			drawSquare(felt);
		}
	 
		 
		
	}
	 static void drawSquare(Color colorA) {
		Robot rob = new Robot();
		rob.setPenColor(colorA);
		rob.show();
		rob.penDown();
	for(int i =0;i<4;i++) {
		rob.move(100);
		rob.turn(90);
	}
	rob.hide();
}
	 static void drawTriangle(Color colorB) {
		Robot rob = new Robot();
		rob.setPenColor(colorB);
		rob.show();
		rob.penDown();
	for(int i = 0; i<3;i++) {
		rob.move(110);
		rob.turn(120);
	}
	rob.hide();
	}
	static void drawCircle(Color colorC) {
		Robot rob = new Robot();
		rob.setPenColor(colorC);
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
	
	

