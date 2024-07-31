package com.example.customqueries.controllers;

import com.example.customqueries.entities.Flight;
import com.example.customqueries.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/create")
    public void createFlights() {
        flightService.createRandomFlights();
    }

    @GetMapping("/list")
    public List<Flight> getFlights() {
        return flightService.flightList();
    }
}
