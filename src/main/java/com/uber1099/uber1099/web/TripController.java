package com.uber1099.uber1099.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.uber1099.uber1099.pojo.Trip;
import com.uber1099.uber1099.service.trip.TripServiceImpl;

@RestController
public class TripController {

    @Autowired
    TripServiceImpl tripService;

    @GetMapping("trips")
    public ResponseEntity<List<Trip>> getTrips(){
        List<Trip> trips = tripService.getAllTrips();
        return new ResponseEntity<>(trips, HttpStatus.OK);
    }

    @GetMapping("user/{user_id}/trip/{trip_id}")
    public void getTrip(@PathVariable(value = "user_id") String id, @PathVariable String trip_id){
        System.out.println("user id is: " + id + " and trip id is " + trip_id);

    }
    
}
