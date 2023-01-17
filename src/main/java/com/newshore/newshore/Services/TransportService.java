package com.newshore.newshore.Services;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.newshore.newshore.Repositories.TransportRepository;
import com.newshore.newshore.models.Transport;

@Service
public class TransportService {
    private TransportRepository transportRepository;

    public TransportService(TransportRepository transportRepository){
        this.transportRepository = transportRepository;
    }
        public Transport getTransport(Long id){
            Transport transport = null;
            Optional<Transport> OptionalTransport = transportRepository.findById(id);
            if(OptionalTransport.isPresent()){
                transport = OptionalTransport.get();
            }
            return transport;
        }
}

