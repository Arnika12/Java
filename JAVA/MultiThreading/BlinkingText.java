import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlinkingText extends JFrame {
    private JLabel textLabel;

    public BlinkingText() {
        setTitle("Blinking Text");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create label with initial text
        textLabel = new JLabel("Blinking Text");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Create and start a separate thread for blinking effect
        Thread blinkThread = new Thread(new BlinkTask());
        blinkThread.start();

        // Add label to frame
        getContentPane().add(textLabel, BorderLayout.CENTER);
    }

    // Runnable class for blinking effect
    private class BlinkTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    // Toggle visibility of text label every 500 milliseconds
                    Thread.sleep(500);
                    SwingUtilities.invokeLater(() -> textLabel.setVisible(!textLabel.isVisible()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BlinkingText().setVisible(true);
        });
    }
}
