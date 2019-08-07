package com.company.airlineTravel.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="airlines")
public class Airlines {
    @Id
    private Integer airlineid;
    @NotEmpty
    @Length(max = 255)
    private String airline;
    @NotEmpty
    private String hubHome;

    public Integer getAirlineid() {
        return airlineid;
    }

    public void setAirlineid(Integer airlineid) {
        this.airlineid = airlineid;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getHubHome() {
        return hubHome;
    }

    public void setHubHome(String hubHome) {
        this.hubHome = hubHome;
    }
}