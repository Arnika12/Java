// 2. Write a multithreading program using Runnable interface to blink Text on the frame.

import java.awt.*;
import java.awt.event.*;

public class BlinkText extends Frame implements Runnable
{
	private boolean flag;
	private Color backgroundColor;
	
	public BlinkText()
	{
		setTitle("Blink");
		setSize(500,300);
		setLocation(100,100);
		setVisible(true);
		backgroundColor = getBackground();
		Thread t = new Thread(this);
		t.start();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
        	if (flag) {
            	g.setColor(Color.BLACK); // Set text color to black
            	g.drawString("Welcome to MIT ACSC", 100, 150);
        	} else {
            	g.setColor(backgroundColor); // Set text color to background color
            	g.drawString("Welcome to MIT ACSC", 100, 150);
        	}
        	
        	addWindowListener(new WindowAdapter()
        	{
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
 	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(100);
			}

			catch(InterruptedException e)
			{
				System.out.println("Error");
			}
			flag=!flag;
			repaint();
		}
	}
	
	public static void main(String args[])
	{
		new BlinkText();
	}
}


