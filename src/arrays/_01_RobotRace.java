package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method

	public static void main(String[] args) {
	Random rand = new Random();
	
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
	
	int x = 0;
	for(int i = 0; i < 5; i++) {
		Robot rob = new Robot();
		robots[i] = rob;
		
		rob.setX(x);
		rob.setY(600);
		x+=200;
		rob.setSpeed(25);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	int winner = 0;
	boolean move = true;
	while(move)
		for(int i = 0;i < robots.length; i++ ) {
			robots[i].move(rand.nextInt(50));
			int y = robots[i].getY();
			if(y < 0) {
				move = false;
				winner = i; 
				JOptionPane.showMessageDialog(null, "Hooray, Robot " + winner + " won");
			}
		}
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.
	
	//9. make the robots race around a circular track.
}	
	
}
