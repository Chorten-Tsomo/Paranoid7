/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagementsystem.DOA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.usermanagementsystem.bean.RegisterUser;

/**
 *
 * @author tsomo
 */
public class MyDb {
     private String dburl="jdbc:mysql://localhost:3306/usermanagementsystem";
     private String dbuemail="root";
     private String dbupass="mysql";
     private String dbdriver="com.mysql.jdbc.Driver";
     
     public void loadDriver(String dbDriver){
         try {
             Class.forName(dbDriver);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     public Connection getConnection(){
         Connection connection=null;
         try{
             connection=DriverManager.getConnection(dburl,dbuemail,dbupass);
         }catch(SQLException e){
             //to autogenerate catch block
             e.printStackTrace();
         }
         return connection;
     }
     public String insert(RegisterUser user){
         loadDriver(dbdriver);
         Connection connection=getConnection();
         String result="Data entered successfully";
         String sql="Insert into usermanagementsystem.user values(?,?,?,?,?,?,?)";
         
        try{
           PreparedStatement ps=connection.prepareStatement(sql);
           ps.setString(1,user.getFirstname());
           ps.setString(2,user.getLastname());
           ps.setString(3,user.getAddress());
           ps.setString(4,user.getPhonenum());
           ps.setString(5,user.getEmail());
           ps.setString(6,user.getPassword());
           ps.setString(7,user.getConfirmpassword());
           ps.executeUpdate();
           
           
        }catch(SQLException e){
            e.printStackTrace();
            result="Data not entered";
        }
        return null;
        
        }

    
}
