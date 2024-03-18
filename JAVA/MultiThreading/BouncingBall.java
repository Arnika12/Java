import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends Frame implements Runnable {
    private int x, y, w, h, f;
    private Color c = Color.RED;
    private final int BALL_SIZE = 50;
    private final int THREAD_SLEEP_TIME = 10;

    public BouncingBall() {
        setTitle("Bouncing Ball");
        setSize(400, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Get width and height after the frame is visible
        w = getWidth();
        h = getHeight();

        x = (int) (Math.random() * w);
        y = (int) (Math.random() * h);

        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            switch (f) {
                case 0:
                    y++;
                    if (y >= h - BALL_SIZE) {
                        c = getRandomColor();
                        f = 1;
                    }
                    break;
                case 1:
                    y--;
                    if (y <= 0) {
                        c = getRandomColor();
                        f = 0;
                    }
                    break;
            }
            repaint();
            try {
                Thread.sleep(THREAD_SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c);
        g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
    }

    private Color getRandomColor() {
        return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }

    public static void main(String args[]) {
        new BouncingBall();
    }
}

