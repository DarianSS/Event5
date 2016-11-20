package com.event5.controller;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.event5.assets.Keys;
import com.event5.dao.CacheBackedDao;
import com.event5.model.Data;
import com.event5.model.Event;
import com.event5.model.Response;
import com.monkeylearn.MonkeyLearnException;

@RestController
public class ServerEndpoint {

	@RequestMapping(path = "/request",
    		method = RequestMethod.GET)
    @ResponseBody
    public List<Event> filter(@RequestParam(value="event_type", required=true) String event_type,
    		@RequestParam(value="city", required=false) String city,
    		@RequestParam(value="start_time", required=true) String input_start_time,
    		@RequestParam(value="end_time", required=true) String input_end_time) {
		
		LocalDateTime start_time, end_time;
    	
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(input_start_time);
		strBuilder.delete(19, 24);
		strBuilder.append(".000");
		start_time = LocalDateTime.parse(strBuilder.toString());
		
		strBuilder.delete(0, input_start_time.length());
		strBuilder.append(input_end_time);
		strBuilder.delete(19, 24);
		strBuilder.append(".000");
		end_time = LocalDateTime.parse(strBuilder.toString());
    		
		strBuilder.delete(0, input_start_time.length());
    	strBuilder.append("https://graph.facebook.com/search?q=");
    	strBuilder.append(city);
    	strBuilder.append("&type=event&access_token=" + Keys.FB_KEY);
    	String query = strBuilder.toString();
    	
    	RestTemplate restTemplate = new RestTemplate();
    	Response response = restTemplate.getForObject(query, Response.class);
    	
    	List<Event> cache = response.getData();
    	try {
			cache = CacheBackedDao.filter(cache, event_type);
		} catch (MonkeyLearnException e) {
			e.printStackTrace();
		}
    	
        return cache;
    }
}
