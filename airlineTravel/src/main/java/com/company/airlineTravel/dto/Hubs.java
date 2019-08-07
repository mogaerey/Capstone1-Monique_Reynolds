package com.company.airlineTravel.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="hubs")
public class Hubs {   @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer hubsid;
    @NotEmpty
    @Length(max = 255)
    private String airportCode;
    @NotEmpty
    @Length(max = 255)
    private String airportName;
    @NotEmpty
    @Length(max = 255)
    private String airportLocation;

    public Integer getHubsid() {
        return hubsid;
    }

    public void setHubsid(Integer hubsid) {
        this.hubsid = hubsid;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportLocation() {
        return airportLocation;
    }

    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }
}
