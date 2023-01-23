package com.uber1099.uber1099.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {

    @GetMapping("user/{user_id}/trip/{trip_id}")
    public void getTrip(@PathVariable(value = "user_id") String id, @PathVariable String trip_id){
        System.out.println("user id is: " + id + " and trip id is " + trip_id);

    }
    
}
