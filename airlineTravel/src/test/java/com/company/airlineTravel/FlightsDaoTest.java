package com.company.airlineTravel;


import com.company.airlineTravel.dao.FlightsRepository;
import com.company.airlineTravel.dto.Flights;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightsDaoTest {
    @Autowired
    FlightsRepository flightsRepo;
    Flights flight1;
    Flights flight2;


    @Before
    public void setUp(){
        flight1 = new Flights();
        flight1.setFlightsId(33);
        flight1.setFlightNum(5774);
        flight1.setHub("DAL");
        flight1.setDeparture("DAL");
        flight1.setDestination("PHL");
        flight1.setMileage(785.0);
        flight1.setAirline("American Airlines");
        flight1.setFlightTotal(674.00);


        flight2 = new Flights();
        flight2.setFlightsId(34);
        flight2.setFlightNum(5775);
        flight2.setHub("LAX");
        flight2.setDeparture("LAX");
        flight2.setDestination("MIA");
        flight2.setMileage(1233.0);
        flight2.setAirline("Delta Airlines");
        flight2.setFlightTotal(780.00);


    }
    @Test
    @Transactional
    public void testAddFlights(){
        flightsRepo.save(flight1);
        flightsRepo.save(flight2);


        assertNotNull(flight1.getFlightsId());

    }
    @Test
    @Transactional
    public void testDeleteFlights(){
        flightsRepo.save(flight1);
        flightsRepo.deleteById(flight1.getFlightsId());
        Optional<Flights>fromRepo = flightsRepo.findById(flight1.getFlightsId());
        assertFalse(fromRepo.isPresent());
    }
    @After
    public void teardown(){
        flightsRepo.deleteAll();
    }
}