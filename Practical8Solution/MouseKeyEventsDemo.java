import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseGUI extends JFrame implements MouseListener, KeyListener {
    JTextField tb1;
    JLabel l1;

    public void setMouse() {
        tb1 = new JTextField(20);
        l1 = new JLabel("Result");
        add(tb1);
        add(l1);
        // Mouse event handling
        tb1.addMouseListener(this);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse clicked.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse entered in textfield.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited.");
    }

    public void setKey() {
        tb1 = new JTextField(50);
        l1 = new JLabel();
        add(tb1);
        add(l1);

        tb1.addKeyListener(this);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("Key is typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key is pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l1.setText("Key is released");
    }
}

public class MouseKeyEventsDemo {
    public static void main(String[] args) {
        MouseGUI m1 = new MouseGUI();
        m1.setMouse();
        m1.setKey();
    }
}