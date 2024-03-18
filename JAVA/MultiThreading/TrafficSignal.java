import java.awt.*;
import java.awt.event.*;
class TrafficSignal extends Frame
{
	private int f;
	private MyThread t;
	
	public TrafficSignal()
	{
		t = new MyThread();
		t.start();
		setTitle("Traffic Signal");
		setSize(300,600);
		setVisible(true);
		setBackground(Color.BLACK);
	}

	

	public void paint(Graphics g)
	{
		super.paint(g);
		int w = 100;
		int h = 100;

		// Center coordinates of the window
    	int centerX = getWidth() / 2;
    	int centerY = getHeight() / 2;

		switch(f)
		{
			case 0:
				g.setColor(Color.RED);
				g.fillOval(centerX - w / 2,200,w,h);
				g.setColor(Color.WHITE);
				g.fillOval(centerX - w / 2,h+200,w,h);
				g.fillOval(centerX - w / 2,2*h+200,w,h);
				break;
			case 1:
				g.setColor(Color.YELLOW);
				g.fillOval(centerX - w / 2,h+200,w,h);
				g.setColor(Color.WHITE);
				g.fillOval(centerX - w / 2,200,w,h);
				g.fillOval(centerX - w / 2,2*h+200,w,h);
				break;
			case 2:
				g.setColor(Color.GREEN);
				g.fillOval(centerX - w / 2,2*h+200,w,h);
				g.setColor(Color.WHITE);
				g.fillOval(centerX - w / 2,200,w,h);
				g.fillOval(centerX - w / 2,h+200,w,h);
				break;
		}
		
		addWindowListener(new WindowAdapter()
        	{
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

	class MyThread extends Thread
	{	
		public void run()
		{
			while(true)
			{
				f=(f+1)%3;
				repaint();
				try
				{
					Thread.sleep(2000);
				}

				catch (InterruptedException e) 
				{
					System.out.println("error"+e);
				}
			}
		}
	}
	public static void main(String args[])
	{
		new TrafficSignal();
	}
}
