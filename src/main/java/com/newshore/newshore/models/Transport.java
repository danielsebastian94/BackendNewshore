package com.newshore.newshore.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name ="transport")
public class Transport implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    
    @Column(nullable = false)
    public String flightCarrier;

    @Column(nullable = false)
    public String flightNumber;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFlightCarrier() {
        return flightCarrier;
    }
    public void setFlightCarrier(String flightCarrier) {
        this.flightCarrier = flightCarrier;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}