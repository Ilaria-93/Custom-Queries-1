package com.example.customqueries.services;

import com.example.customqueries.entities.Flight;
import com.example.customqueries.enums.StatusEnum;
import com.example.customqueries.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public void createRandomFlights() {
        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            Flight flight = new Flight(i, random.toString(), random.toString(), random.toString(), StatusEnum.ON_TIME);
            flightRepository.save(flight);
        }
    }

    public List<Flight> flightList() {
        return flightRepository.findAll();
    }
}
