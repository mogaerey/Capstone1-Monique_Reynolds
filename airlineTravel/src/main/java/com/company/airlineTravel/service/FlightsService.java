package com.company.airlineTravel.service;

import com.company.airlineTravel.dao.FlightsRepository;
import com.company.airlineTravel.dto.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class FlightsService {
    @Autowired
    private FlightsRepository flightRepo;

    public Flights addFlights(Flights flight) {
        flightRepo.save(flight);
        return flight;
    }

    public List<Flights> getAllFlights() {
        return flightRepo.findAll();
    }

    public void updateFlights(Flights airline, int id) {
        flightRepo.save(airline);
    }

    public void deleteFlights(int id) {
        flightRepo.deleteById(id);
    }

    public List<Flights> findFlightsByAirlineAndHub(String airline, String hub) {
        return flightRepo.findFlightsByAirlineAndHub(airline, hub);
    }

    public List<Flights> findFlightsByHubAndDestination(String hub, String destination) {
        return flightRepo.findFlightsByHubAndDestination(hub, destination);
    }


}