/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class connectdb {
    
    Connection c;
Statement s;
public connectdb()
{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","");
        s=c.createStatement();
    }
    catch(ClassNotFoundException | SQLException e)
    {
        System.out.println(e);
    }
    
}  
}

