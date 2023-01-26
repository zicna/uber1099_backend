package com.uber1099.uber1099.pojo;

import java.util.Date;

public class Expense {
    private String id;
    private String user_id;
    private String type;
    private String amount;
    private Date date;


    public Expense(String id, String user_id, String type, String amount, Date date) {
        this.id = id;
        this.user_id = user_id;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public Expense() {
    }

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUser_id() {
        return this.user_id;
    }
    
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}

