package com.company.airlineTravel.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="flights")
public class Flights {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Integer flightsId;
    @NotNull
    private Integer flightNum;
    @NotEmpty
    private String hub;
    @NotEmpty
    private String departure;
    @NotEmpty
    private String destination;
    private Double mileage;
    private String airline;
    private Double flightTotal;

    public Integer getFlightsId() {
        return flightsId;
    }

    public void setFlightsId(Integer flightsId) {
        this.flightsId = flightsId;
    }

    public Integer getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(Integer flightNum) {
        this.flightNum = flightNum;
    }

    public String getHub() {
        return hub;
    }

    public void setHub(String hub) {
        this.hub = hub;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Double getFlightTotal() {
        return flightTotal;
    }

    public void setFlightTotal(Double flightTotal) {
        this.flightTotal = flightTotal;
    }
}
