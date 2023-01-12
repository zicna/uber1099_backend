package com.uber1099.uber1099.pojo;

import java.util.Date;
// * we will not use UUID for creating user ids for better testing with postman
import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// import javax.validation.constraints.*;

public class User {
    
    private String id;

    @NotBlank(message = "email can not be blank")
    @Email
    private String email;
    
    private String password;

    @NotBlank(message = "dob can not be empty")
    private Date date_of_birth;
    private String user_name;

    public User(String id, String email, String password, Date date_of_birth, String user_name){
        this.id = id;
        this.email = email;
        this.password = password;
        this.user_name = user_name;
        this.date_of_birth = date_of_birth;
    }

    public User(){
    }

    public String getId() {
        return id;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

}
