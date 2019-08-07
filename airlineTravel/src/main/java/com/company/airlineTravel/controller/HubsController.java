package com.company.airlineTravel.controller;

import com.company.airlineTravel.dto.Hubs;
import com.company.airlineTravel.service.HubsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HubsController {
    @Autowired
    private HubsService hubsService;

    @RequestMapping(value = "/hubs", method = RequestMethod.GET)
    public List<Hubs> getAllHubs(){
        return hubsService.getAllHubs();
    }
}
