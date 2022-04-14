package com.hostel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class login extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2;

    login(){
        super("Vasundhara Vaibhav Hostel");

        l1 = new JLabel("Welcome to Vasundhara Vaibhav Boy's Hostel");
        l1.setFont(new Font("Osward", Font.BOLD, 20));
        l1.setBounds(80,40,450,40);
        add(l1);

        l2 = new JLabel("Username");
        l2.setFont(new Font("Osward", Font.BOLD, 15));
        l2.setBounds(85,120,450,40);
        add(l2);

        l3 = new JLabel("Roll No.");
        l3.setFont(new Font("Osward", Font.BOLD, 15));
        l3.setBounds(85,200,450,40);
        add(l3);

        l4 = new JLabel("Wing No.");
        l4.setFont(new Font("Osward", Font.BOLD, 15));
        l4.setBounds(85,280,450,40);
        add(l4);

        t1 = new JTextField();
        t1.setBounds(200,127,200,25);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(200,207,200,25);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(200,287,200,25);
        add(t3);

        b1  = new JButton("login");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(150,375,100,30);
        add(b1);

        b2  = new JButton("new member");
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(290,375,130,30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);
        setSize(600,600);
    }

    public void actionPerformed(ActionEvent ev){
       try {
           if (ev.getSource() == b1) {
               Conn c1 = new Conn();
               Conn c2 = new Conn();
               String name = t1.getText();
               String roll = t2.getText();
               String wing = t3.getText();
               String q = "Select * from login where name = '" +name+"' and roll = '"+roll+"'";
               String x = "Select * from login where wing = '"+wing+"'";
               ResultSet rs = c1.s.executeQuery(q);
               rs = c2.s.executeQuery(x);
               if (rs.next()) {
                   setVisible(false);
                   new welcome().setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null, "Incorrect Entry");
               }
           }
           else if (ev.getSource() == b2){
               setVisible(false);
               new newMember().setVisible(true);
           }
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }
    }
    public static void main(String[] args) {
        new login().setVisible(true);
    }
}
