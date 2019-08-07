package com.company.airlineTravel.service;


import com.company.airlineTravel.dao.HubsRepository;
import com.company.airlineTravel.dto.Hubs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class HubsService {
    @Autowired
    private HubsRepository hubsRepo;

    public List<Hubs> getAllHubs(){
        return hubsRepo.findAll();
    }
}
