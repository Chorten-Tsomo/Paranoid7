/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tsomo
 */
public class DBConnection {
     public static Connection createConnection()
    {
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/usermanagementsystem";
    String username = "root";
    String password = "root123";
 
    try
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        con = DriverManager.getConnection(url, username, password);
        System.out.println("Post establishing a DB connection - "+con);
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return con;
    }
    
}
