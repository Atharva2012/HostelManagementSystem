package com.hostel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changePass extends JFrame implements ActionListener {

    changePass(){
        JLabel l1,l2,l3,l4,l5,l6;
        JButton b,b1;
        JPasswordField t1,t2;

        l1 = new JLabel("Change Password");
        l1.setFont(new Font("System", Font.BOLD, 25));
        l1.setForeground(Color.BLACK);
        l1.setBounds(280,10,800,35);
        add(l1);

        l2 = new JLabel("New Password:");
        l2.setFont(new Font("System", Font.BOLD, 17));
        l2.setForeground(Color.BLACK);
        l2.setBounds(150,100,800,35);
        add(l2);

        l3 = new JLabel("Confirm New Password:");
        l3.setFont(new Font("System", Font.BOLD, 17));
        l3.setForeground(Color.BLACK);
        l3.setBounds(150,150,800,35);
        add(l3);

        l4 = new JLabel("Maximum Password Length:10");
        l4.setFont(new Font("System", Font.ROMAN_BASELINE, 15));
        l4.setForeground(Color.lightGray);
        l4.setBounds(150,250,800,35);
        add(l4);

        l5 = new JLabel("Minimum Password Length:5");
        l5.setFont(new Font("System", Font.ROMAN_BASELINE, 15));
        l5.setForeground(Color.lightGray);
        l5.setBounds(150,290,800,35);
        add(l5);

        l6 = new JLabel("Password is Case-Sensitive");
        l6.setFont(new Font("System", Font.ROMAN_BASELINE, 15));
        l6.setForeground(Color.lightGray);
        l6.setBounds(150,330,800,35);
        add(l6);

        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));
        t1.setBounds(370,100,200,30);
        add(t1);

        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 25));
        t2.setBounds(370,150,200,30);
        add(t2);

        b = new JButton("Back");
        b.setBounds(390,330,90,35);
        add(b);

        b1 = new JButton("Update");
        b1.setBounds(550,330,90,35);
        add(b1);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(750, 600);
        setLocation(500,120);
    }    public void actionPerformed(ActionEvent ev){

    }
    public static void main(String[] args) {
        new changePass().setVisible(true);
    }
}
