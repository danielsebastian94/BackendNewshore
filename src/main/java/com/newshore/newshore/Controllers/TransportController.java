package com.newshore.newshore.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.newshore.newshore.Services.TransportService;
import com.newshore.newshore.models.Transport;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin
public class TransportController {
    @Autowired
    private TransportService transportService;

    @RequestMapping(value="transport/{id}", method=RequestMethod.GET)
    public ResponseEntity<Transport> getTransport(@PathVariable Long id) {
        Transport transport = transportService.getTransport(id);
        if(transport != null){
            return ResponseEntity.ok(transport);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    } 
    
    
}
