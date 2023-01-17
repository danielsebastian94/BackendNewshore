package com.newshore.newshore.Repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.newshore.newshore.models.Transport;

public interface TransportRepository extends CrudRepository<Transport, Long> { 
    Optional<Transport> findByid(Long id);  
}