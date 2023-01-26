package com.uber1099.uber1099.pojo;
// * not important at this point 
// * only as a POJO, later db table to create trips as a join table
public class Rider {
    
    private String id;
    private String email;

    // * 
    public Rider(String id, String email){
        this.id = id;
        this.email = email;
    }

    public Rider(){}
    // * getters
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    // * setters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }

}   
