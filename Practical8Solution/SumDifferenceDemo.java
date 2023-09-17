import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumDifferenceDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum and Difference Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField inputField1 = new JTextField(10);
        frame.add(inputField1);

        JTextField inputField2 = new JTextField(10);
        frame.add(inputField2);

        JTextField outputField = new JTextField(10);
        outputField.setEditable(false);
        frame.add(outputField);

        JButton sumButton = new JButton("Calculate Sum");
        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(inputField1.getText());
                    int num2 = Integer.parseInt(inputField2.getText());
                    int sum = num1 + num2;
                    outputField.setText("Sum: " + sum);
                } catch (NumberFormatException ex) {
                    outputField.setText("Invalid input");
                }
            }
        });
        frame.add(sumButton);

        JButton diffButton = new JButton("Calculate Difference");
        diffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(inputField1.getText());
                    int num2 = Integer.parseInt(inputField2.getText());
                    int diff = num1 - num2;
                    outputField.setText("Difference: " + diff);
                } catch (NumberFormatException ex) {
                    outputField.setText("Invalid input");
                }
            }
        });
        frame.add(diffButton);
        frame.pack();
        frame.setVisible(true);
    }
}