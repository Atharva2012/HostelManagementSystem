package com.hostel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.util.*;

public class details extends JFrame implements ActionListener {

    details() {
        super("Vasundhara Vaibhav");

        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9,l10,l11,l12;
        JLabel t1,t2,t3,t5,t6,t7,t8,t9,t10,t11;
        JButton b1,b2,b3;
        Random ran = new Random();
        long first4 = (ran.nextLong() % 9000L) + 1000L;
        String first = "" + Math.abs(first4);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("D:\\people.png"));
//        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        l12 = new JLabel(i3);
//        l12.setBounds(20,0,100,100);
        l1 = new JLabel("Details of Student");
        l1.setBounds(300, 20, 450, 40);
        l1.setFont(new Font("Osward", Font.BOLD, 27));
        add(l1);

        l2 = new JLabel("Name:");
        l2.setBounds(100, 100, 450, 40);
        l2.setFont(new Font("Osward", Font.ROMAN_BASELINE, 20));
        add(l2);

        l3 = new JLabel("Father's Name:");
        l3.setBounds(100, 150, 450, 40);
        l3.setFont(new Font("Osward", Font.ROMAN_BASELINE, 20));
        add(l3);

        l4 = new JLabel("Date of Birth:");
        l4.setBounds(100, 200, 450, 40);
        l4.setFont(new Font("Osward", Font.ROMAN_BASELINE, 20));
        add(l4);

        l5 = new JLabel("Gender:");
        l5.setBounds(100, 250, 450, 40);
        l5.setFont(new Font("Osward",Font.ROMAN_BASELINE, 20));
        add(l5);

        l6 = new JLabel("Email Address:");
        l6.setBounds(100, 300, 450, 40);
        l6.setFont(new Font("Osward",Font.ROMAN_BASELINE, 20));
        add(l6);

        l8 = new JLabel("Wing No.");
        l8.setBounds(100, 350, 450, 40);
        l8.setFont(new Font("Osward",Font.ROMAN_BASELINE, 20));
        add(l8);

        l7 = new JLabel("Address:");
        l7.setBounds(100, 400, 450, 40);
        l7.setFont(new Font("Osward",Font.ROMAN_BASELINE, 20));
        add(l7);

        l9 = new JLabel("City:");
        l9.setBounds(100, 450, 450, 40);
        l9.setFont(new Font("Osward",Font.ROMAN_BASELINE, 20));
        add(l9);

        l10 = new JLabel("Pin Code:");
        l10.setBounds(100, 500, 450, 40);
        l10.setFont(new Font("Osward",Font.ROMAN_BASELINE, 20));
        add(l10);

        l11 = new JLabel("State:");
        l11.setBounds(100, 550, 450, 40);
        l11.setFont(new Font("Osward",Font.ROMAN_BASELINE, 20));
        add(l11);

        t1 = new JLabel("Anakin Skywalker");
        t1.setBounds(300,105,400,30);
        t1.setFont(new Font("Raleway",Font.BOLD,20));
        add(t1);

        t2 = new JLabel("Darth Vader");
        t2.setBounds(300,155,400,30);
        t2.setFont(new Font("Raleway",Font.BOLD,20));
        add(t2);

        t3 = new JLabel("29/02/1969");
        t3.setBounds(300,205,120,30);
        t3.setFont(new Font("Raleway",Font.BOLD,20));
        add(t3);



        t5 = new JLabel("DeathStar@vader.org");
        t5.setBounds(300,305,400,30);
        t5.setFont(new Font("Raleway",Font.BOLD,20));
        add(t5);

        t6 =new JLabel("A");
        t6.setBounds(300,355,400,30);
        t6.setFont(new Font("Raleway",Font.BOLD,20));
        add(t6);

        t7 = new JLabel("Ocean moon Kef Bir");
        t7.setBounds(300,405,400,30);
        t7.setFont(new Font("Raleway",Font.BOLD,20));
        add(t7);

        t8 = new JLabel("Pune");
        t8.setBounds(300,455,400,30);
        t8.setFont(new Font("Raleway",Font.BOLD,20));
        add(t8);

        t9 = new JLabel("44110");
        t9.setBounds(300,505,400,30);
        t9.setFont(new Font("Raleway",Font.BOLD,20));
        add(t9);

        t10 = new JLabel("Maharashtra");
        t10.setBounds(300,555,400,30);
        t10.setFont(new Font("Raleway",Font.BOLD,20));
        add(t10);

        l12 = new JLabel("Male");
        l12.setBounds(300, 250, 400, 30);
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        add(l12);

        b1 = new JButton("View & Pay Bill");
        b1.setBounds(600,650,120,30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        add(b1);

        b2 = new JButton("Update");
        b2.setBounds(400,650,120,30);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        add(b2);

        b3 = new JButton("Edit");
        b3.setBounds(200,650,120,30);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(850, 800);
        setLocation(500,120);
    }
    public void actionPerformed (ActionEvent ev){

    }
    public static void main(String[] args) {
        new details().setVisible(true);
    }
}
