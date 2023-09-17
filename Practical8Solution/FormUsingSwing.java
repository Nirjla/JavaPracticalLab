import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Registration extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tb1, tb2, tb3, tb4;
    JRadioButton rb1, rb2;
    JCheckBox cb1, cb2, cb3;
    JComboBox cmb1;
    JButton btn1, btn2;

    public void setRegistration() {
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("Repassword");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Course");
        l6 = new JLabel("Phone");
        l7 = new JLabel("Country");
        l8 = new JLabel("Result");

        tb1 = new JTextField(20);
        tb2 = new JTextField(20);
        tb3 = new JTextField(20);
        tb4 = new JTextField(20);

        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        cb1 = new JCheckBox("Java");
        cb2 = new JCheckBox("C++");
        cb3 = new JCheckBox("DBMS");

        String[] arr = {"Nepal", "China", "Japan", "India", "Srilanka"};
        cmb1 = new JComboBox(arr);

        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");

        add(l1);
        add(tb1);
        add(l2);
        add(tb2);
        add(l3);
        add(tb3);
        add(l4);
        add(rb1);
        add(rb2);
        add(l5);
        add(cb1);
        add(cb2);
        add(cb3);
        add(l6);
        add(tb4);
        add(l7);
        add(cmb1);
        add(btn1);
        add(btn2);
        add(l8);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
//        3 means JFRAME.EXIT_ON_CLOSE
        setSize(300, 300);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
//            extract form data into variable
            String username = tb1.getText();
            String password = tb2.getText();
            String repassword = tb2.getText();

//              username must be greater than two charaters
            if(username.length()<=0)
            {
                System.out.println("Username cannot be empty");
            }
            if (username.length() < 2) {
                System.out.println("username should be greater than 2");
            }
            if (password != repassword) {
                System.out.println("password and repassword doesnt match");
            }
            if(password.length()<=0){
                System.out.println("Password cannot be empty");
            }
            if(repassword.length()<=0){
                System.out.println("Repassword cannot be empty");
            }
            String gender = "";
            if (rb1.isSelected()) {
                gender += "Male";

            } else {
                gender += "Female";
            }
            String course = "";
            if (cb1.isSelected()) {
                course += "Java" + " ";

            }
            if (cb2.isSelected()) {
                course += "C++";

            }
            if (cb3.isSelected()) {
                course += "DBMS";
            }
            String phone = tb4.getText();
            if(phone.length()<=0 && phone.length()<10){
                System.out.println("Phone should be of 10 digits");
            }
            String country = "";
            country += cmb1.getSelectedItem();
            //showing final output in label l8
       String result = "username: "+username+" password: "+password+ " repassword: "+repassword+ " gender: "+gender+" course: "+course+" phone: "+phone+" country: "+country;
       l8.setText(result);

//       database connection
        //    
        }
    }

}

public class FormUsingSwing {

    public static void main(String[] args) {

        Registration r1 = new Registration();
        r1.setRegistration();
    }

}
