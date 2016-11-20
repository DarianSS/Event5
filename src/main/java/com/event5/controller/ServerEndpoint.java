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
    public Data filter(@RequestParam(value="event_type", required=true) String event_type,
    		@RequestParam(value="location_type", required=true) double location_type,
    		@RequestParam(value="radius", required=false) double radius,
    		@RequestParam(value="latitude", required=false) double latitude,
    		@RequestParam(value="longitude", required=false) double longitude,
    		@RequestParam(value="city", required=false) String city,
    		@RequestParam(value="area", required=false) String area,
    		@RequestParam(value="street", required=false) String street,
    		@RequestParam(value="start_time", required=true) LocalDateTime start_time,
    		@RequestParam(value="end_time", required=true) LocalDateTime end_time) {
    	
		String location; 
		StringBuilder strbuilder = new StringBuilder();
    	
    	if (location_type == 1) {
    		strbuilder.append(city);
    		strbuilder.append(area);
    		strbuilder.append(street);
    		
    		location = strbuilder.toString();
    	}
    	else {
    		location = LocationUtils.getCity(latitude, longitude);
    	}
    		
    	strbuilder.append("https://graph.facebook.com/search?q=");
    	strbuilder.append(location);
    	strbuilder.append("&type=event&access_token=EAAJzDEJrRf4BADSY86YGZBStUx276PXvMKZBKrPjuzGjoCuh7crLZALXyLhvAIUor1Y8tbFOiHI58K6HzFOA6lsfXhIiGbiRJe0jCve28eIcZA8SMdMfTHHS3rq4i5UyRtBPIm2ZBQ60XB919oKfTZCIwJoFb9LPYaB9GV0Ww2QwZDZD");
    	String query = strbuilder.toString();
    	
    	ArrayList<Event> data = 
    		 
        return new Data(	);
    }
}
