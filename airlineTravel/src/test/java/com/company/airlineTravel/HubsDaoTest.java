package com.company.airlineTravel;

import com.company.airlineTravel.dao.HubsRepository;
import com.company.airlineTravel.dto.Hubs;
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
public class HubsDaoTest {
    @Autowired
    HubsRepository hubsRepo;
    Hubs hub1;
    Hubs hub2;

    @Before
    public void setUp(){
        hub1 = new Hubs();
        hub1.setHubsid(14);
        hub1.setAirportCode("PHA");
        hub1.setAirportName("Philadelphia International Airport");
        hub1.setAirportLocation("Philadelphia, PA");

        hub1 = new Hubs();
        hub1.setHubsid(15);
        hub1.setAirportCode("DSM");
        hub1.setAirportName("Des Moines International");
        hub1.setAirportLocation("Des Moines, IA");
    }
    @Test
    @Transactional
    public void testGetAllHubs(){
        hubsRepo.save(hub1);
        List<Hubs>fromRepo = hubsRepo.findAll();
        assertEquals(hub1, fromRepo.get(hub1.getHubsid()));
    }
    @After
    public void teardown(){
        hubsRepo.deleteAll();
    }
}