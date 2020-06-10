/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usermanagementsystem.bean;

/**
 *
 * @author tsomo
 */
public class RegisterUser {
    
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String phonenum;
    private String email;
    private String password;
    private String confirmpassword;
    
    public RegisterUser(){
    }

    public RegisterUser(String firstname, String lastname, String address, String phonenum, String email, String password, String confirmpassword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phonenum = phonenum;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

  
    
    public RegisterUser( int id , String firstname, String lastname, String address, String phonenum, String email, String password, String confirmpassword) {
        this.id=id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phonenum = phonenum;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }
    
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id=id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
    
    


    
}
