package com.company.airlineTravel.controller;
import com.company.airlineTravel.dto.Flights;
import com.company.airlineTravel.service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
public class FlightsController {
    @Autowired
    private FlightsService flightsService;

    @RequestMapping(value = "/flights", method = RequestMethod.POST)
    public Flights addFlights(@RequestBody @Valid Flights flight) {
        flightsService.addFlights(flight);
        return flight;
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List<Flights> getAllFlights() {
        return flightsService.getAllFlights();
    }

    @RequestMapping(value = "/flights/{id}", method = RequestMethod.DELETE)
    public void deleteFlight(@PathVariable int id) {
        flightsService.deleteFlights(id);
    }

    @RequestMapping(value = "/flights/airlineAndHub/{airline}/{hub}", method = RequestMethod.GET)
    public List<Flights> getFlightsByAirlineAndHub(@PathVariable String airline, @PathVariable String hub) {
        return flightsService.findFlightsByAirlineAndHub(airline, hub);
    }

    @RequestMapping(value = "/flights/hubAndDestination/{hub}/{destination}", method = RequestMethod.GET)
    public List<Flights> findFlightsByHubAndDestination(@PathVariable String hub, @PathVariable String destination) {
        return flightsService.findFlightsByHubAndDestination(hub, destination);
    }
}