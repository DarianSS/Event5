package com.event5.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.event5.model.Data;
import com.event5.model.Event;
import com.event5.utils.LocationUtils;

@RestController
public class ServerEndpoint {

	@RequestMapping(path = "/request",
    		method = RequestMethod.GET)
    @ResponseBody
    public String filter(@RequestParam(value="event_type", required=true) String event_type,
    		@RequestParam(value="location_type", required=true) Double location_type,
    		@RequestParam(value="radius", required=false) Double radius,
    		@RequestParam(value="latitude", required=false) Double latitude,
    		@RequestParam(value="longitude", required=false) Double longitude,
    		@RequestParam(value="city", required=false) String city,
    		@RequestParam(value="area", required=false) String area,
    		@RequestParam(value="street", required=false) String street,
    		@RequestParam(value="start_time", required=true) String start_time,
    		@RequestParam(value="end_time", required=true) String end_time) {
    	
		String location; 
		StringBuilder strbuilder = new StringBuilder();
    	
    	if (location_type == 2) {
    		strbuilder.append(city);
    		strbuilder.append(area);
    		strbuilder.append(street);
    		
    		location = strbuilder.toString();
    	}
    	else {
    		location = LocationUtils.getCity(latitude, longitude);
    	}
    	
    	System.out.println(location);
    	
    	return location;
    		
  
    	
    	// ArrayList<Event> data = 
    		 
        // return new Data(	);
    }
}
