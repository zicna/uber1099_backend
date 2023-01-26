package com.uber1099.uber1099.pojo;

public class Trip{


// * primary key 
private String id;
// * foreing key 
private String user_id;
// * foreing key 
private String rider_id;
private Float distance; 
private Float net_fare; 
private Float tip; 
// * total seconds of a trip 
private Integer duration; 
// * LIFT / UBER only options
private String provider; 

public Trip(String id, String user_id, String rider_id, Float distance, Float net_fare, Float tip, String provider){
    this.id = id;
    this.user_id = user_id;
    this.rider_id = rider_id;
    this.distance = distance;
    this.net_fare = net_fare;
    this.tip = tip;
    this.provider = provider;
}
// * empty constractor
public Trip(){}

// * all the getters
public String getId() {
    return id;
}
public String getuser_id() {
    return user_id;
}
public String getRider_id() {
    return rider_id;
}
public Float getDistance() {
    return distance;
}
public Integer getDuration() {
    return duration;
}
public Float getNet_fare() {
    return net_fare;
}
public String getProvider() {
    return provider;
}
public Float getTip() {
    return tip;
}

// * all the setters
public void setDistance(Float distance) {
    this.distance = distance;
}
public void setuser_id(String user_id) {
    this.user_id = user_id;
}
public void setDuration(Integer duration) {
    this.duration = duration;
}
public void setId(String id) {
    this.id = id;
}public void setNet_fare(Float net_fare) {
    this.net_fare = net_fare;
}
public void setProvider(String provider) {
    this.provider = provider;
}
public void setRider_id(String rider_id) {
    this.rider_id = rider_id;
}
public void setTip(Float tip) {
    this.tip = tip;
}
}