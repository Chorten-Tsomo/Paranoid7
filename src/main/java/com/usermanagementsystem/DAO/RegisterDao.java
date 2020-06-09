/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagementsystem.DAO;

import com.usermanagementsystem.bean.RegisterBean;
import com.usermanagementsystem.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tsomo
 */
public class RegisterDao {
    public String registerUser(RegisterBean registerBean)
     {
         String firstname = registerBean.getFirstname();
         String lastname = registerBean.getLastname();
         String address = registerBean.getAddress();
         String phonenum = registerBean.getPhonenum();
         String email = registerBean.getEmail();
         String password = registerBean.getPassword();
         String confirmpassword = registerBean.getConfirmpassword();
         
         Connection con = null;
         PreparedStatement preparedStatement = null;         
         try
         {
             con = DBConnection.createConnection();
             String query = "insert into users(SlNo,fullName,Email,userName,password) values (NULL,?,?,?,?)"; //Insert user details into the table 'USERS'
             preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
             preparedStatement.setString(1, firstname);
             preparedStatement.setString(2, lastname);
             preparedStatement.setString(3, address);
             preparedStatement.setString(4, phonenum);
             preparedStatement.setString(4, email);
             preparedStatement.setString(5, password);
             preparedStatement.setString(6, confirmpassword);

             
             
             int i= preparedStatement.executeUpdate();
             
             if (i!=0)  //Just to ensure data has been inserted into the database
             return "SUCCESS"; 
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }       
         return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
     }
    
}
