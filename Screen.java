import javax.swing.JPanel;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;

public class Screen extends JPanel implements KeyListener{
	Timer timer;
	Scanner scan;
	ArrayList screenObjects;
	public static int screenWidth = 400;
	public static int screenHeight = 400;
	//initialize movement vectors 
	public static Vector laserVector = new Vector(0,0);
	
	//initialize baffle stuff
	Point bafflePoint;
	Rectangle baffleArea;
	Image baffleImage;
	double baffleAngle; //note: no baffle image
	
	public Screen()
	{
		System.out.println("How many Baffles would you like?");
		int baffles = scan.nextInt();
		System.out.println("Here are your moves: \n 1) Shoot \n 2) Guess \n 3) History");
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.white);
		screenObjects = new ArrayList<ScreenObject>();
		timer = new javax.swing.Timer(25, new TimerListener());
		timer.start();
		// addBaffle();

	}
	
	public void addBaffle(){
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		int determine = rand.nextInt(1);
		if (determine == 1){
			baffleAngle = 45;
		}
		else{
			baffleAngle = 135;
		}
		//create the baffle based on those points
		int baffleX = (screenWidth/x) - 20;
		int baffleY = (screenHeight/y) - 20;
		bafflePoint = new Point(baffleX, baffleY);
		baffleArea = new Rectangle(20, 1);
		Baffle baffle = new Baffle(bafflePoint, baffleArea, baffleImage, baffleAngle);
		//note: no actual baffle image
	}
	
	public void shoot(int locat){
		// addLaserShot();
		//change the vector of the laser shot upon collision
	}
	
	public void addLaserShot(){
		
	}
	
private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Check for collisions
			for(int i = 0; i < screenObjects.size(); i++){
				
			}
		}
	}

@Override
public void keyPressed(KeyEvent event) {

		
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyTyped(KeyEvent event) {
	
	int keyCode = event.getKeyCode();
	switch (keyCode){
	
	case KeyEvent.VK_1:
		// use the shoot method to shoot at the user input location
		System.out.println("Where do you want the shot to go?");
		int location = scan.nextInt();
		while (location > 39){
			System.out.println("Please enter a valid location");
			location = scan.nextInt();
		}
		shoot(location);
		break;
	
	
	case KeyEvent.VK_2:
		// prompt user to guess
		break;
	
	case KeyEvent.VK_3:
		// display history
		break;
	}
	
}
}
