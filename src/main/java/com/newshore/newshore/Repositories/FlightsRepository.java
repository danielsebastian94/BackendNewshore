package com.newshore.newshore.Repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.newshore.newshore.models.Flights;


public interface FlightsRepository extends CrudRepository<Flights, Long> {
    Optional<Flights> findByid(Long id);
    
}
