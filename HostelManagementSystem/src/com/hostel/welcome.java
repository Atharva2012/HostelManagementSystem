package com.hostel;

import javax.swing.*;
import java.awt.*;

public class welcome extends JFrame {
    welcome(){
        JLabel l1;
        l1 = new JLabel("Welcome Back");
        l1.setBounds(280,10,800,35);
        l1.setFont(new Font("System",Font.BOLD,35));
        add(l1);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(850, 800);
        setLocation(500,120);
    }
    public static void main(String[] args) {
        new welcome().setVisible(true);
    }
}
