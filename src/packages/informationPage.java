package packages;

import javax.swing.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(new Color(0xD3DC8F));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField nameField = new JTextField(15);
        nameField.setHorizontalAlignment(JLabel.CENTER);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        ageLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField ageField = new JTextField(15);
        ageField.setHorizontalAlignment(JLabel.CENTER);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        emailLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField emailField = new JTextField(15);
        emailField.setHorizontalAlignment(JLabel.CENTER);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");
        levelLabel.setHorizontalAlignment(JLabel.CENTER);

        JRadioButton level1 = new JRadioButton("مبتدی");
        level1.setHorizontalAlignment(JLabel.CENTER);
        JRadioButton level2 = new JRadioButton("متوسط");
        level2.setHorizontalAlignment(JLabel.CENTER);
        JRadioButton level3 = new JRadioButton("پیشرفته");
        level3.setHorizontalAlignment(JLabel.CENTER);
        JRadioButton level4 = new JRadioButton("بدون آشنایی");
        level4.setHorizontalAlignment(JLabel.CENTER);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.setHorizontalAlignment(JLabel.CENTER);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel, BorderLayout.NORTH);
        panel.add(nameField, BorderLayout.NORTH);
        panel.add(ageLabel, BorderLayout.NORTH);
        panel.add(ageField, BorderLayout.NORTH);
        panel.add(emailLabel, BorderLayout.NORTH);
        panel.add(emailField, BorderLayout.NORTH);
        panel.add(levelLabel, BorderLayout.NORTH);
        panel.add(level1, BorderLayout.NORTH);
        panel.add(level2, BorderLayout.NORTH);
        panel.add(level3, BorderLayout.NORTH);
        panel.add(level4, BorderLayout.NORTH);
        panel.add(nextButton, BorderLayout.NORTH);



        // Add panel to the frame
        frame.add(panel);
    }
}
