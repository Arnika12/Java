import java.awt.*;
import javax.swing.*;

class VerticalLine extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10, 10, 10, 200); // Change the coordinates to adjust the line position
    }
}

public class VerticalLines {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vertical Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(1, 5)); // Set layout to grid with 5 columns

        // Create five instances of VerticalLine and add them to the frame
        for (int i = 0; i < 5; i++) {
            VerticalLine line = new VerticalLine();
            frame.add(line);
        }

        frame.setVisible(true);
    }
}
