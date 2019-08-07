package com.company.airlineTravel;

        import com.company.airlineTravel.dao.AirlinesRepository;
        import com.company.airlineTravel.dto.Airlines;
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
public class AirlinesDaoTest {
    @Autowired
    AirlinesRepository airlinesRepo;
    Airlines airline1;
    Airlines airline2;
    Airlines airline3;
    Airlines airline4;

    @Before
    public void setUp(){
        airline1 = new Airlines();
        airline1.setAirline("Jet Blue");
        airline1.setAirlineid(7);
        airline1.setHubHome("LGA");

        airline2 = new Airlines();
        airline2.setAirline("Spirit Airlines");
        airline2.setAirlineid(8);
        airline2.setHubHome("MIA");

        airline3 = new Airlines();
        airline3.setAirline("Virgin Airines");
        airline3.setAirlineid(9);
        airline3.setHubHome("DAL");

        airline4 = new Airlines();
        airline4.setAirline("Alaska Airlines");
        airline4.setAirlineid(10);
        airline4.setHubHome("SEA");
    }
    @Test
    @Transactional
    public void testAddAirline(){
        airlinesRepo.save(airline1);
        airlinesRepo.save(airline2);
        airlinesRepo.save(airline3);
        airlinesRepo.save(airline4);

        assertNotNull(airline1.getAirline());

    }
    @Test
    @Transactional
    public void testDeleteAirlines(){
        airlinesRepo.save(airline1);
        airlinesRepo.deleteById(airline1.getAirlineid());
        Optional<Airlines>fromRepo = airlinesRepo.findById(airline1.getAirlineid());
        assertFalse(fromRepo.isPresent());
    }
    @After
    public void teardown(){
        airlinesRepo.deleteAll();
    }
}