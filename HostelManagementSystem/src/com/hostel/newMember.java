package com.hostel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.util.*;

public class newMember extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JTextField t1, t2, t3, t5, t7, t8, t9, t10;
    JRadioButton r1, r2;
    JButton b, b1;
    JComboBox c1;

    newMember() {
        super("Vasundhara Vaibhav");


//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("D:\\people.png"));
//        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        l12 = new JLabel(i3);
//        l12.setBounds(20,0,100,100);
        l1 = new JLabel("Enter Details For New Allotment");
        l1.setBounds(200, 20, 450, 40);
        l1.setFont(new Font("Osward", Font.BOLD, 27));
        add(l1);

        l2 = new JLabel("Name:");
        l2.setBounds(100, 100, 450, 40);
        l2.setFont(new Font("Osward", Font.BOLD, 20));
        add(l2);

        l3 = new JLabel("Father's Name:");
        l3.setBounds(100, 150, 450, 40);
        l3.setFont(new Font("Osward", Font.BOLD, 20));
        add(l3);

        l4 = new JLabel("Date of Birth:");
        l4.setBounds(100, 200, 450, 40);
        l4.setFont(new Font("Osward", Font.BOLD, 20));
        add(l4);

        l5 = new JLabel("Gender:");
        l5.setBounds(100, 250, 450, 40);
        l5.setFont(new Font("Osward", Font.BOLD, 20));
        add(l5);

        l6 = new JLabel("Email Address:");
        l6.setBounds(100, 300, 450, 40);
        l6.setFont(new Font("Osward", Font.BOLD, 20));
        add(l6);

        l8 = new JLabel("Wing_No");
        l8.setBounds(100, 350, 450, 40);
        l8.setFont(new Font("Osward", Font.BOLD, 20));
        add(l8);

        String[] Wing_No = {"A", "B", "C", "D"};
        c1 = new JComboBox(Wing_No);
        c1.setBounds(300, 350, 70, 40);
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c1);

        l7 = new JLabel("Address:");
        l7.setBounds(100, 400, 450, 40);
        l7.setFont(new Font("Osward", Font.BOLD, 20));
        add(l7);

        l9 = new JLabel("City:");
        l9.setBounds(100, 450, 450, 40);
        l9.setFont(new Font("Osward", Font.BOLD, 20));
        add(l9);

        l10 = new JLabel("Pin Code:");
        l10.setBounds(100, 500, 450, 40);
        l10.setFont(new Font("Osward", Font.BOLD, 20));
        add(l10);

        l11 = new JLabel("State:");
        l11.setBounds(100, 550, 450, 40);
        l11.setFont(new Font("Osward", Font.BOLD, 20));
        add(l11);

        t1 = new JTextField();
        t1.setBounds(300, 105, 400, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(300, 155, 400, 30);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(300, 205, 120, 30);
        add(t3);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 255, 60, 30);
        r1.setBackground(Color.white);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 255, 100, 30);
        r2.setBackground(Color.white);
        add(r2);

        t5 = new JTextField();
        t5.setBounds(300, 305, 400, 30);
        add(t5);

        t7 = new JTextField();
        t7.setBounds(300, 405, 400, 30);
        add(t7);

        t8 = new JTextField();
        t8.setBounds(300, 455, 400, 30);
        add(t8);

        t9 = new JTextField();
        t9.setBounds(300, 505, 400, 30);
        add(t9);

        t10 = new JTextField();
        t10.setBounds(300, 555, 400, 30);
        add(t10);

        b = new JButton("Next");
        b.setBounds(600, 650, 100, 30);
        b.setForeground(Color.white);
        b.setBackground(Color.black);
        add(b);

        b1 = new JButton("Back");
        b1.setBounds(400, 650, 100, 30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        add(b1);

        b1.addActionListener(this);
        b.addActionListener(this);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(850, 800);
        setLocation(500, 120);
    }
    public void actionPerformed(ActionEvent ev){
        String name = t1.getText();
        String fnam = t2.getText();
        String dob = t3.getText();
        String gender = "";
        String mail = t5.getText();
        String Wing_No = (String)c1.getSelectedItem();
        String address = t7.getText();
        String city = t8.getText();
        String pin = t9.getText();
        String state = t10.getText();

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        try{
            if(t7.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else{
                Conn c1 = new Conn();
                String str = "insert into newmember values('"+name+"','"+fnam+"','"+dob+"','"+gender+"','"+mail+"','"+Wing_No+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c1.s.executeUpdate(str);

                new pay().setVisible(true);
                setVisible(false);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new newMember().setVisible(true);
    }
}

