import javax.swing.*;
import packages.informationPage;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout);
        panel.setBackground(new Color(0xD3DC8F));
        panel.setBounds(0, 0, 600, 600);


        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی");
        title.setHorizontalAlignment(JLabel.CENTER);


        // Create start button
        JButton startButton = new JButton("شروع!");
        startButton.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.NORTH);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
