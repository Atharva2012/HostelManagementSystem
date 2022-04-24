package com.hostel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;
import java.sql.PreparedStatement;
import java.util.*;
import java.awt.Container;

public class newMember extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JTextField name, fname,dob,mail,address,city,pin,state;
    JRadioButton r1, r2;
    JButton b, b1;
    JComboBox c1;

    newMember() {
        super("Vasundhara Vaibhav");

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

        name = new JTextField();
        name.setBounds(300, 105, 400, 30);
        add(name);

        fname = new JTextField();
        fname.setBounds(300, 155, 400, 30);
        add(fname);

        dob = new JTextField();
        dob.setBounds(300, 205, 120, 30);
        add(dob);

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

        mail = new JTextField();
        mail.setBounds(300, 305, 400, 30);
        add(mail);

        address = new JTextField();
        address.setBounds(300, 405, 400, 30);
        add(address);

        city = new JTextField();
        city.setBounds(300, 455, 400, 30);
        add(city);

        pin = new JTextField();
        pin.setBounds(300, 505, 400, 30);
        add(pin);

        state = new JTextField();
        state.setBounds(300, 555, 400, 30);
        add(state);

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
        String t1 = name.getText();
        String t2 = fname.getText();
        String t3 = dob.getText();
        String gender = "";
        String t4 = mail.getText();
        String Wing_No = (String)c1.getSelectedItem();
        String t5 = address.getText();
        String t6 = city.getText();
        String t7 = pin.getText();
        String t8 = state.getText();

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        try{
            if(pin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else if (ev.getSource() == b1){
                new login().setVisible(true);
                setVisible(false);
            }
            else{
                Conn c1 = new Conn();
                String str = "insert into newmember values('"+t1+"','"+t2+"','"+t3+"','"+gender+"','"+t4+"','"+Wing_No+"','"+t5+"','"+t6+"','"+t7+"','"+t8+"')";
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
//        new newMember().setVisible(true);
        newMember sp = new newMember();
        Container c = sp.getContentPane();
        c.setBackground(Color.gray);
    }
}

