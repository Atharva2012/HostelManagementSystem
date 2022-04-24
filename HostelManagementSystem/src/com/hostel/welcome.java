package com.hostel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1,b2,b3,b4,b5;
    welcome(){
        l1 = new JLabel("Welcome Back");
        l1.setBounds(250,10,800,35);
        l1.setFont(new Font("System",Font.BOLD,35));
        add(l1);

        b1 = new JButton("Login");
        b1.setBounds(50,200,100,45);
        b1.setFont(new Font("System",Font.BOLD,15));
        add(b1);

        b2 = new JButton("Change Password");
        b2.setBounds(250,200,200,45);
        b2.setFont(new Font("System",Font.BOLD,15));
        add(b2);

        b3 = new JButton("Help");
        b3.setBounds(50,400,100,45);
        b3.setFont(new Font("System",Font.BOLD,15));
        add(b3);

        b4 = new JButton("New member");
        b4.setBounds(50,300,130,45);
        b4.setFont(new Font("System",Font.BOLD,15));
        add(b4);

        b5 = new JButton("Details of Student");
        b5.setBounds(450,300,210,45);
        b5.setFont(new Font("System",Font.BOLD,15));
        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 600);
        setLocation(500,120);
    }
    public void actionPerformed(ActionEvent ev){
        if (ev.getSource() == b1){
            new login().setVisible(true);
            setVisible(false);
        }
        else if (ev.getSource() == b2){
            new changePass().setVisible(true);
            setVisible(false);
        }
        else if (ev.getSource() == b3){
            new help().setVisible(true);
            setVisible(false);
        }
        else if (ev.getSource() == b4){
            new newMember().setVisible(true);
            setVisible(false);
        }
        else if (ev.getSource() == b5){
            new details().setVisible(true);
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new welcome().setVisible(true);
    }
}
