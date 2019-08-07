package com.company.airlineTravel.dao;

import com.company.airlineTravel.dto.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface FlightsRepository extends JpaRepository <Flights, Integer> {
    List<Flights>findFlightsByAirlineAndHub(String airline, String hub);
    List<Flights>findFlightsByFlightTotal(Double flightTotal);
    List<Flights>findFlightsByHubAndDestination(String hub, String destination);
}
