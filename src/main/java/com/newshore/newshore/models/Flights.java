package com.newshore.newshore.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name ="flight")
public class Flights implements Serializable{

   /*  public Flights(Long id, Transport transport, String origin, String destination, double price) {
        this.id = id;
        this.transport = transport;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }
    public Flights() {
    }*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "trasport_id")
    public Transport transport;


    @Column(nullable = false)
    public String origin;


    @Column(nullable = false)
    public String destination;

    public double price;
    
    /*public Flights(Transport transport, String origin, String destination, double price) {
        this.transport = transport;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }*/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
   public Transport getTransport() {
        return transport;
    }
    public void setTransport(Transport transport) {
        this.transport = transport;
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



    
}
