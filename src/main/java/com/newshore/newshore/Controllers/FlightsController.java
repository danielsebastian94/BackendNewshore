package com.newshore.newshore.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.newshore.newshore.Services.FlightsService;
import com.newshore.newshore.models.Flights;

@RestController
@CrossOrigin
public class FlightsController {
    
    @Autowired
    private FlightsService flightsService;
    
    @RequestMapping(value = "/flights/{id}", method = RequestMethod.GET)
    public ResponseEntity<Flights> getFlight(@PathVariable Long id){
        Flights flights = flightsService.getFlights(id);
        if(flights != null){
            return ResponseEntity.ok(flights);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @RequestMapping(value="/flights", method=RequestMethod.GET)
    public ResponseEntity<Iterable<Flights>> getAllFlights()throws Exception {
    return ResponseEntity.ok(flightsService.getAllFlights());
    }
}                                                                                                                      
    
