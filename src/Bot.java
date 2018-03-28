import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bot
{
	//Instance Variables
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  double width = screenSize.getWidth();
	  double height = screenSize.getHeight();
	  	  
	  
	//Create Bot Object
  Robot robot = new Robot();
  JFrame frame = new JFrame();
  JPanel panel = new JPanel();
  JLabel label = new JLabel("Auto Clicker <3");
  JLabel label1 = new JLabel("Width : " + width);
  JLabel label2 = new JLabel("Height : " + height);
  JButton b1 = new JButton("Run");



  
  //Main Runs Bot Logic
  public static void main(String[] args) throws AWTException
  {
    new Bot();
  }
  
  //Bot Logic
  public Bot() throws AWTException
  {
	  setUp();
	  System.out.println("Bot Started..");
	  getScreen();
	  //mouseMove();
	  //leftClick();
	  //leftClickSpam(10000);
	  System.out.print("Bot Ended..");
  }
  
  //Bot Methods
  
  //JFrame setup
  public void setUp()
  {  
	  //Add Labels to Panel
	  panel.add(label);
	  panel.add(label1);
	  panel.add(label2);
	  //Add buttons to Panel
	  panel.add(b1);
	  //Add Panel to JFrame
	  frame.add(panel);
	  //Set Size
	  frame.setSize(new Dimension(500, 300));
	  //set default close action
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  //title
	  frame.setTitle("Auto Clicker 1.0");
	  //Etc
	  frame.setResizable(false);
	  frame.setVisible(true);
  }
  
  //Regular Click
  public void leftClick()
  {
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(200);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.delay(200);
  }
  
  //Click Spam
  public void leftClickSpam(int clicks)
  {
	  for (int i =0; i <clicks; i++) 
	  {
		  robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  robot.mouseRelease(InputEvent.BUTTON1_MASK);
	  }
  }
  
  //Move Mouse
  public void mouseMove()
  {
	  for (int i =0; i < 500; i++)
	  {
		  robot.mouseMove(700, i);
		  robot.delay(1);
	  }
  }
  
  //Get Screen Size
  public void getScreen()
  {
	  System.out.println("Width: " +width);
	  System.out.println("Height: " +height);
	  
  }
  
}