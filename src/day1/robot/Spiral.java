package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
Robot tim=new Robot();	
tim.turn(360/3);		
tim.penDown();
tim.setSpeed(10);

for (int i = 0; i < 75; i++) {
tim.setRandomPenColor();
tim.move(5*i);
tim.turn(360/7);
tim.setPenWidth(i);
	
			// 9. Set the pen width to i
}
	}
}
