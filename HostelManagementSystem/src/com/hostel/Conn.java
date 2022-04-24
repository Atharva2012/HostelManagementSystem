package com.hostel;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hostel_Management_System","root","insecuredme666@$1");
            s =c.createStatement();

        }catch(Exception e){
            System.out.println("database error" + e);
        }
    }
}
