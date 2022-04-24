package com.hostel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class pay extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5,l6,l7,l8,l9,l10;
    JButton b;
    pay() {
        super("Vasundhara Vaibhav");

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\HostelManagementSystem\\src\\com\\hostel\\.idea\\Mobile-Payment.jpg")));
        setLayout(new FlowLayout());

        l1 = new JLabel("View & Pay Bill");
        l1.setFont(new Font("Raleway", Font.BOLD, 27));
        l1.setBounds(290,30,400,40);
        add(l1);

        l2 = new JLabel("Wing No.:");
        l2.setBounds(200,110,400,50);
        l2.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 20));
        add(l2);

        l3 = new JLabel("Room Number:");
        l3.setBounds(200,160,400,50);
        l3.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 20));
        add(l3);

        l4 = new JLabel("Name:");
        l4.setBounds(200,210,400,50);
        l4.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 20));
        add(l4);

        l5 = new JLabel("Amount To Be Paid:");
        l5.setBounds(200,310,400,50);
        l5.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 20));
        add(l5);

        l7 = new JLabel("A");
        l7.setBounds(500,110,400,50);
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l7);

        l8 = new JLabel("401");
        l8.setBounds(500,160,400,50);
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l8);

        l8 = new JLabel("351044");
        l8.setBounds(500,260,400,50);
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l8);

        l9 = new JLabel("Anakin SkyWalker");
        l9.setBounds(500,210,400,50);
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l9);

        l6 = new JLabel("Roll No.:");
        l6.setBounds(200,260,400,50);
        l6.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 20));
        add(l6);

        l10 = new JLabel("₹ 4000");
        l10.setBounds(500,310,400,50);
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l10);

        b = new JButton("Pay Amount");
        b.setBounds(297,410,170,50);
        b.setBackground(Color.lightGray);
        b.setFont(new Font("Raleway", Font.BOLD, 22));
        add(b);
        b.addActionListener(this);



        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(750, 600);
        setLocation(500,120);
    }
        public void actionPerformed (ActionEvent ev){
        if (ev.getSource() == b){
            JOptionPane.showMessageDialog(null, "Your room has been booked");
        }
        }
    public static void main(String[] args){
       new pay().setVisible(true);
    }
}
