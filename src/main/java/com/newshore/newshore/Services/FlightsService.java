package com.newshore.newshore.Services;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.newshore.newshore.Repositories.FlightsRepository;
import com.newshore.newshore.models.Flights;


@Service
public class FlightsService {

    private FlightsRepository flightsRepository;

    //Constructor que inyecta la dependencia de repository
    public FlightsService(FlightsRepository flightsRepository){
        this.flightsRepository = flightsRepository;
    }

    public Flights getFlights(Long id){
        Flights flights = null;
        Optional<Flights> OptionalFlights = flightsRepository.findById(id);
        if(OptionalFlights.isPresent()){
            flights = OptionalFlights.get();
        }
        return flights;
    }

    public Iterable<Flights> getAllFlights() throws Exception{
        return flightsRepository.findAll();
    }
    
}
