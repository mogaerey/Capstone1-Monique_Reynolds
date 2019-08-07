package com.company.airlineTravel.service;


import com.company.airlineTravel.dao.AirlinesRepository;
import com.company.airlineTravel.dto.Airlines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AirlinesService {
   @Autowired
   private AirlinesRepository airlineRepo;

   public Airlines addAirlines(Airlines airline){
       airlineRepo.save(airline);
       return airline;
   }
   public List<Airlines>getAllAirlines(){
       return airlineRepo.findAll();
   }
   public void updateAirlines(Airlines airline, int id){
       airlineRepo.save(airline);
   }
   public void deleteAirlines(int id){
       airlineRepo.deleteById(id);
   }




}
