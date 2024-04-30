// Write a java program for drawing flag.  

import java.awt.*;
import javax.swing.*;

public class FlagDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Define dimensions
        int width = getWidth();
        int height = getHeight();
        
        // Draw the flag
        drawFlagOfIndia(g, width, height);
    }
    
    private void drawFlagOfIndia(Graphics g, int width, int height) {
    // Define colors
    Color orangeColor = Color.ORANGE; 
    Color whiteColor = Color.WHITE;
    Color greenColor = Color.GREEN; 
    Color blueColor = Color.BLUE; 

    // Calculate stripe heights
    int stripeHeight = height / 3;
    
    // Draw blue stripe
    g.setColor(orangeColor);
    g.fillRect(0, 0, width, stripeHeight);
    
    // Draw white stripe
    g.setColor(whiteColor);
    g.fillRect(0, stripeHeight, width, stripeHeight);
    
    // Draw red stripe
    g.setColor(greenColor);
    g.fillRect(0, 2 * stripeHeight, width, stripeHeight);
    
    // Add space around the flag
    int space = Math.min(width, height) / 20; // 5% of the minimum dimension
    int flagWidth = width - 2 * space;
    int flagHeight = height - 2 * space;
    
    // Draw circle of blue color inside the white band
    int circleDiameter = flagHeight / 3; // Diameter is one-third of the flag height
    int circleX = (width - circleDiameter) / 2; // Center the circle horizontally
    int circleY = stripeHeight + (stripeHeight - circleDiameter) / 2; // Center the circle vertically in the white stripe
    g.setColor(blueColor);
    g.fillOval(circleX, circleY, circleDiameter, circleDiameter);
}

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flag of India");
        FlagDrawing flagDrawing = new FlagDrawing();
        frame.add(flagDrawing);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
