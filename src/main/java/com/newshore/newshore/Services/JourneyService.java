package com.newshore.newshore.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newshore.newshore.Repositories.JourneyRepository;
import com.newshore.newshore.models.JourneyModel;
import java.util.InputMismatchException;


@Service
public class JourneyService {
    @Autowired
    JourneyRepository journeyReposotiry;

    public ArrayList<JourneyModel> getRoutes(){
       return (ArrayList<JourneyModel>) journeyReposotiry.findAll();
    }

    public JourneyModel saveRoute(JourneyModel route){
        return journeyReposotiry.save(route);
    }

    public ArrayList<JourneyModel> getForOrigin(String origin){
        try{
            return (ArrayList<JourneyModel>) journeyReposotiry.findAll();
        }
        catch(InputMismatchException ex){
            //throw new ResourceNotFoundException("There is no category with the ID: " )
            System.out.println( "su consulta no puede ser procesada: " + ex ); // capturado!
        }
        return null;    
    }

    public ArrayList<JourneyModel> getForDestination(String destination){
        return (ArrayList<JourneyModel>) journeyReposotiry.findAll();
    }
  
}

