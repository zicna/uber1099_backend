package com.uber1099.uber1099.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class Car {
    
    private String id;
    @NotEmpty(message = "car must belog to user")
    private String user_id;
    private String make;
    private String model;
    private String year;
    private String vin;
    private String color;

    public Car(String id, String user_id, String make, String model, String year, String vin, String color){
        this.id = id;
        this.user_id = user_id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.color = color;
    }

    public Car(){}

    public String getColor() {
        return color;
    }
    public String getId() {
        return id;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getUser_id() {
        return user_id;
    }
    public String getVin() {
        return vin;
    }public String getYear() {
        return year;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
