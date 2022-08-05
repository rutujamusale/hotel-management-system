/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class tables {
    public static void main(String[]args) {
                
		Connection con=null;
                Statement st=null;
                try{
                    con = ConnectionProvider.getcon();
                    st = con.createStatement();
                    //st.execute("create table users(name varchar(200),email varchar(200),password varchar(200),securityQestion varchar(500),answer varchar(200),location varchar(100),status varchar(20))");
                    //st.execute("create table room (roomNo int primary key,roomType varchar(200),bed varchar(200),price int,status varchar(20))");
                    st.executeUpdate("create table customer (id int primary key,name varchar(200),mobileNumber varchar(10),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(12),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerday int,numberOfDaysStay int(10),totalAmount varchar(200),checkOut varchar(50))");
                JOptionPane.showMessageDialog(null, "Table Create Successfully");
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
		finally{
                    try{
                    con.close();
                    st.close();
                }
                catch(Exception e){
                    
                }
                }
		
    }
}
