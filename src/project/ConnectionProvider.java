/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con;
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
		System.out.println("DB connected");
                return con;
        }
        catch(Exception e)
        {
            return null;
        }
		
    }
}
    
