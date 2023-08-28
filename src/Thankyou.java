import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Thankyou extends JFrame {

    public Thankyou() {
        setTitle("Thank You");
        setSize(500, 400);
        setLocation(100, 100);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel thankYouLabel = new JLabel("Thank you! Your response was submitted.");
        thankYouLabel.setBounds(50, 50, 400, 30); // Adjusted position
        thankYouLabel.setHorizontalAlignment(JLabel.CENTER); // Center the label text
        add(thankYouLabel);

        JTextArea feedbackTextArea = new JTextArea();
        feedbackTextArea.setBounds(50, 100, 400, 150); // Adjusted position
        add(feedbackTextArea);

        JButton submitFeedback = new JButton("Submit Feedback");
        submitFeedback.setBounds(180, 280, 140, 30); // Adjusted position
        add(submitFeedback);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Thankyou();
    }
}



