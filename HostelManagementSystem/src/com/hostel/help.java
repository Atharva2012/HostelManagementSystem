package com.hostel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class help extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b;
    help(){
        super("Vasundhara Vaibhav");

        l1 = new JLabel("If you have any issue contact: ");
        l1.setBounds(280,500,800,35);
        l1.setFont(new Font("System",Font.BOLD,25));
        add(l1);

        b = new JButton("Back");
        b.setBounds(400,620,90,35);
        add(b);

        l11 = new JLabel("Abhishek Upmanyu : 8692437748 ");
        l11.setBounds(320,550,800,35);
        l11.setFont(new Font("System",Font.CENTER_BASELINE,15));
        add(l11);

        l10 = new JLabel("Rules and Regulation");
        l10.setBounds(280,10,800,35);
        l10.setFont(new Font("System",Font.BOLD,25));
        add(l10);


        l2 = new JLabel("Smoking, Alcohol & Narcotic consumption is strictly prohibited in and around the Hostel premises.");
        l2.setBounds(10,60,800,35);
        l2.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l2);

        l3 = new JLabel("Late comers will be penalized.");
        l3.setBounds(10,110,800,35);
        l3.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l3);

        l4 = new JLabel("Birthday/Other Celebrations are strictly prohibited in Hostel.");
        l4.setBounds(10,160,800,35);
        l4.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l4);

        l5 = new JLabel("The Management & Staff will not be responsible for personal belongings.");
        l5.setBounds(10,210,800,35);
        l5.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l5);

        l6 = new JLabel("Students are not allowed to organize any group activities in their room.");
        l6.setBounds(10,260,800,35);
        l6.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l6);

        l7 = new JLabel("Students are not allowed to use electric stoves, heaters etc in rooms except in designated places.");
        l7.setBounds(10,310,800,35);
        l7.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l7);

        l8 = new JLabel("Students during their stay in the hostel will be governed by the management rules.");
        l8.setBounds(10,360,800,35);
        l8.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l8);

        l9 = new JLabel("The Management & Staff will not be responsible for personal belongings.");
        l9.setBounds(10,410,800,35);
        l9.setFont(new Font("System",Font.ROMAN_BASELINE,15));
        add(l9);

        b.addActionListener(this);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(850, 800);
        setLocation(500,120);
    }

    public void actionPerformed(ActionEvent ev){
        if (ev.getSource() == b){
            new welcome().setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new help().setVisible(true);
    }
}
