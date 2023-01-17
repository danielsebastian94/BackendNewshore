package com.newshore.newshore.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newshore.newshore.Services.JourneyService;
import com.newshore.newshore.models.JourneyModel;

@RestController
@RequestMapping("/route")
public class JourneyController {
   @Autowired
   JourneyService journeyService;

   @GetMapping()
   public ArrayList<JourneyModel>getRoutes(){
    return journeyService.getRoutes();
   }
   @PostMapping()
   public JourneyModel saveRoute(@RequestBody JourneyModel route){
    return this.journeyService.saveRoute(route);
   }
   @GetMapping(path = "/origin")
   public ArrayList<JourneyModel> getForOrigin(@RequestParam("origin") String origin){
    return this.journeyService.getForOrigin(origin);
   }
   @GetMapping(path = "/destination")
   public ArrayList<JourneyModel> getForDestination(@RequestParam("destination") String destination){
    return this.journeyService.getForDestination(destination);
   }
}
