package com.company.airlineTravel.controller;

import java.util.*;
import com.company.airlineTravel.dto.Airlines;
import com.company.airlineTravel.service.AirlinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AirlinesController {
    @Autowired
    private AirlinesService airlinesService;

    @RequestMapping(value="/airlines",method = RequestMethod.POST)
    public Airlines addAirline (@RequestBody @Valid Airlines airline){
        airlinesService.addAirlines(airline);
        return airline;
    }

    @RequestMapping(value = "/airlines", method=RequestMethod.GET)
    public List<Airlines> getAllAirlines(){
        return airlinesService.getAllAirlines();

    }
    @RequestMapping(value="/airlines/{id}", method=RequestMethod.DELETE)
    public void deleteAirline(@PathVariable int id){
        airlinesService.deleteAirlines(id);
    }

}
