/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagementsystem.DAO;

import com.usermanagementsystem.bean.LoginBean;
import com.usermanagementsystem.util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tsomo
 */
public class LoginDao {
     public String authenticateUser(LoginBean loginBean)
{
    String email = loginBean.getEmail();
    String password = loginBean.getPassword();
 
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
 
    String emailDB = "";
    String passwordDB = "";
    String roleDB = "";
 
    try
    {
        con = DBConnection.createConnection();
        statement = con.createStatement();
        resultSet = statement.executeQuery("select uemail,upass,role from users");
 
        while(resultSet.next())
        {
            emailDB = resultSet.getString("uemail");
            passwordDB = resultSet.getString("upass");
            roleDB = resultSet.getString("role");
 
            if(email.equals(emailDB) && password.equals(passwordDB) && roleDB.equals("Admin"))
            return "Admin_Role";
            else if(email.equals(emailDB) && password.equals(passwordDB) && roleDB.equals("Guest"))
            return "Guest_Role";
            else if(email.equals(emailDB) && password.equals(passwordDB) && roleDB.equals("User"))
            return "User_Role";
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    return "Invalid user credentials";
}
    
    
}
