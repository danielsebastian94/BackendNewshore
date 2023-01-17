package com.newshore.newshore.models;

import javax.persistence.*;


@Entity
@Table(name ="travel")
public class JourneyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    
    @Column(nullable = false)
    public String origin;

    @Column(nullable = false)
    public String destination;

    @Column(nullable = false)
    public double price;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "flights_id")
    public Flights flights; 

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Flights getFlights() {
        return flights;
    }
    public void setFlights(Flights flights) {
        this.flights = flights;
    }  
}
