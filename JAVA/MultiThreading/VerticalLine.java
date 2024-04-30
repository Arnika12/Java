import java.awt.*;
import javax.swing.*;

class VerticalLine extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(50, 50, 50, 200); // Change the coordinates to adjust the line position
    }
}

public class VerticalLinesDrawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vertical Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create five threads, each drawing a vertical line
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                VerticalLine line = new VerticalLine();
                frame.add(line);
                frame.setVisible(true);
            });
            thread.start();
            try {
                thread.join(); // Wait for each thread to finish before starting the next one
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
