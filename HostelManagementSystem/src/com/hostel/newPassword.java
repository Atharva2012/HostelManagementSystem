package com.hostel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class newPassword extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField pass,t2;
    JButton b1,b2;
    newPassword(){
        super("Vasundhara Vaibhav");

        l1 = new JLabel("Enter new Password");
        l1.setFont(new Font("System", Font.BOLD, 17));
        l1.setForeground(Color.BLACK);
        l1.setBounds(150,60,800,35);
        add(l1);

        l2 = new JLabel("Re-enter new Password");
        l2.setFont(new Font("System", Font.BOLD, 17));
        l2.setForeground(Color.BLACK);
        l2.setBounds(150,120,800,35);
        add(l2);

        pass = new JPasswordField();
        pass.setFont(new Font("Raleway", Font.BOLD, 17));
        pass.setBounds(370,125,200,30);
        add(pass);

        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 17));
        t2.setBounds(370,65,200,30);
        add(t2);

        b1 = new JButton("Back");
        b1.setBounds(300,250,90,35);
        add(b1);

        b2 = new JButton("Next");
        b2.setBounds(460,250,90,35);
        add(b2);

        b2.addActionListener(this);
        b1.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(750, 600);
        setLocation(500,120);
    }

    public void actionPerformed(ActionEvent ev) {
        String t1 = pass.getText();
        String t3 = t2.getText();
        try {
            if (ev.getSource() == b1) {
                new newMember().setVisible(true);
                setVisible(false);
            }
            else if (!pass.getText().equals(t2)) {
                JOptionPane.showMessageDialog(null, "Password does not match");

            }
            else if (pass.getText().equals("") || t2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter all fields");
            }
            else if (ev.getSource() == b2) {
                new pay().setVisible(true);
                setVisible(false);
            }
            else {
                Conn c1 = new Conn();
                String st = "insert into changePass values('" + t1 + "','" + t3 + "')";
                c1.s.executeUpdate(st);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new newPassword().setVisible(true);
    }
}
