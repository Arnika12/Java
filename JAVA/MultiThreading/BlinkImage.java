import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlinkImage extends JFrame {
    private ImageIcon imageIcon;
    private JLabel imageLabel;

    public BlinkImage() {
        setTitle("Blinking Image");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load image
        imageIcon = new ImageIcon("image.png"); 
        imageLabel = new JLabel(imageIcon);

        // Create and start a separate thread for blinking effect
        Thread blinkThread = new Thread(new BlinkTask());
        blinkThread.start();

        // Add image label to frame
        getContentPane().add(imageLabel, BorderLayout.CENTER);
    }

    // Runnable class for blinking effect
    private class BlinkTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    // Toggle visibility of image label every 500 milliseconds
                    Thread.sleep(500);
                    SwingUtilities.invokeLater(() -> imageLabel.setVisible(!imageLabel.isVisible()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BlinkImage().setVisible(true);
        });
    }
}
