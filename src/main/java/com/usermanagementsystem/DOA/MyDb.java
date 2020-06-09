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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tsomo
 */
public class MyDb {
     private static String dburl="jdbc:mysql://127.0.0.1:3325/usermanagementsystem?serverTimezone=UTC";
     private static String dbuemail="root";
     private static String dbupass="";
     private static String dbdriver="com.mysql.jdbc.Driver";
     
     public static void loadDriver(String dbDriver){
         try {
             Class.forName(dbDriver);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     public static Connection getConnection(){
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
         String sql="Insert into usermanagementsystem.user values(?,?,?,?,?,?,?,?)";
         
        try{
           PreparedStatement ps=connection.prepareStatement(sql);
           ps.setInt(1,user.getid());
           ps.setString(2,user.getFirstname());
           ps.setString(3,user.getLastname());
           ps.setString(4,user.getAddress());
           ps.setString(5,user.getPhonenum());
           ps.setString(6,user.getEmail());
           ps.setString(7,user.getPassword());
           ps.setString(8,user.getConfirmpassword());
           ps.executeUpdate();
           
           
        }catch(SQLException e){
            e.printStackTrace();
            result="Data not entered";
        }
        return result;
        
        }

    public  static List <RegisterUser > listAllUsers() {
           loadDriver(dbdriver);
           Connection connection = getConnection();
           String sql = "SELECT * FROM usermanagementsystem.user";
            // Step 2:Create a statement using connection object
           

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < RegisterUser > listRegisterUser = new ArrayList < > ();
          
        
        // Step 1: Establishing a Connection
        try  {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String Firstname = resultSet.getString("Firstname");
            String Lastname = resultSet.getString("Lastname");
            String Address = resultSet.getString("Address");
            String Phonenum= resultSet.getString("Phonenum");
            String Email= resultSet.getString("Email");
            String Password = resultSet.getString("Password");
            String Confirmpassword = resultSet.getString("Confirmpassword");
            listRegisterUser.add(new RegisterUser(id,Firstname, Lastname, Address, Email, Phonenum, Password ,Confirmpassword));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return listRegisterUser;
    }
    
     public static RegisterUser selectUser(int id) {
        loadDriver(dbdriver);
        RegisterUser user = null;
        String sql = "SELECT * FROM usermanagementsystem.user where id=?;";
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                
                String firstname = rs.getString("Firstname");
                String lastname = rs.getString("Lastname");
                String email = rs.getString("Email");
                String address = rs.getString("Address");
                String phonenum = rs.getString("Phonenum");
                String password = rs.getString("Password");
                String confirmpassword = rs.getString("Confirmpassword");
                
               user = new RegisterUser(id,firstname, lastname,email, address, phonenum, password, confirmpassword );
            }
            return user; 
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    
        
    }
     public static boolean deleteUser(int id) throws SQLException,NullPointerException{
         loadDriver(dbdriver);
         boolean rowDeleted;
        String sql = "delete from usermanagementsystem.user where id = ?;";
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    
     }
   
        private  static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
   }
}
