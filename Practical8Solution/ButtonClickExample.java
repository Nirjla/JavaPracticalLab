import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample extends JFrame implements ActionListener {
    private JTextField textField;

    public ButtonClickExample() {
        setTitle("Button Click Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Create text field
        textField = new JTextField(15);
        textField.setEditable(false);

        // Add buttons and text field to the frame
        add(button1);
        add(button2);
        add(textField);

        // Register action listeners for the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();
        textField.setText(buttonText + " is clicked");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ButtonClickExample example = new ButtonClickExample();
            example.setVisible(true);
        });
    }
}