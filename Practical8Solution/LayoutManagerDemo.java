import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutManagerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Null Layout Manager
        JPanel nullPanel = new JPanel();
        nullPanel.setLayout(null);

        JLabel nullLabel = new JLabel("Null Layout");
        nullLabel.setBounds(10, 10, 100, 20);
        nullPanel.add(nullLabel);

        // FlowLayout Manager
        JPanel flowPanel = new JPanel(new FlowLayout());

        JButton flowButton1 = new JButton("Button 1");
        flowPanel.add(flowButton1);

        JButton flowButton2 = new JButton("Button 2");
        flowPanel.add(flowButton2);

        // GridLayout Manager
        JPanel gridPanel = new JPanel(new GridLayout(2, 2));

        JButton gridButton1 = new JButton("Button 1");
        gridPanel.add(gridButton1);

        JButton gridButton2 = new JButton("Button 2");
        gridPanel.add(gridButton2);

        JButton gridButton3 = new JButton("Button 3");
        gridPanel.add(gridButton3);

        JButton gridButton4 = new JButton("Button 4");
        gridPanel.add(gridButton4);

        // BorderLayout Manager
        JPanel borderPanel = new JPanel(new BorderLayout());

        JButton borderButton1 = new JButton("North");
        borderPanel.add(borderButton1, BorderLayout.NORTH);

        JButton borderButton2 = new JButton("South");
        borderPanel.add(borderButton2, BorderLayout.SOUTH);

        JButton borderButton3 = new JButton("West");
        borderPanel.add(borderButton3, BorderLayout.WEST);

        JButton borderButton4 = new JButton("East");
        borderPanel.add(borderButton4, BorderLayout.EAST);

        JButton borderButton5 = new JButton("Center");
        borderPanel.add(borderButton5, BorderLayout.CENTER);

        // CardLayout Manager
        JPanel cardPanel = new JPanel(new CardLayout());

        JButton cardButton1 = new JButton("Card 1");
        cardPanel.add(cardButton1, "Card 1");

        JButton cardButton2 = new JButton("Card 2");
        cardPanel.add(cardButton2, "Card 2");

        JButton cardButton3 = new JButton("Card 3");
        cardPanel.add(cardButton3, "Card 3");

        // Add panels to the frame
        frame.setLayout(new GridLayout(2, 3));
        frame.add(nullPanel);
        frame.add(flowPanel);
        frame.add(gridPanel);
        frame.add(borderPanel);
        frame.add(cardPanel);

        // Button actions for CardLayout
        cardButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.show(cardPanel, "Card 1");
            }
        });

        cardButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.show(cardPanel, "Card 2");
            }
        });

        cardButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.show(cardPanel, "Card 3");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}