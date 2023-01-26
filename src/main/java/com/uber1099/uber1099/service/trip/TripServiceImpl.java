package com.uber1099.uber1099.service.trip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber1099.uber1099.repository.TripRepository;
@Service
public class TripServiceImpl implements TripService{

    @Autowired
    TripRepository tripRepo;

    @Override
    public List getAllTrips() {
        return tripRepo.getTrips();
    }
    
}
