package com.event5.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	String description;
	String name;
	String id;
	String street;
	Place place;
	LocalDateTime start_time, end_time;
	
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getStreet() {
		return street;
	}
	
	public Place getPlace() {
		return place;
	}
	
	public LocalDateTime getStartTime() {
		// System.out.println(start_time.toString());
		return start_time;
	}
	
	public LocalDateTime getEndTime() {
		return end_time;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setId(Place place) {
		this.place = place;
	}
	
	public void setStartTime(String start_time) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(start_time);
		strBuilder.delete(19, 24);
		strBuilder.append(".000");
		
		this.start_time = LocalDateTime.parse(strBuilder.toString());
	}
	
	public void setEndTime(String end_time) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(end_time);
		strBuilder.delete(19, 24);
		strBuilder.append(".000");
		
		this.end_time = LocalDateTime.parse(strBuilder.toString());
	}
	
	@Override
	public String toString() {
		return "Event{" +
	            "description='" + description + '\'' +
	            ", end_time='" + end_time + '\'' +
	            ", name='" + name + '\'' +
	            ", place=" + place + 
	            ", start_time='" + start_time + '\'' +
	            ", id=" + id + 
	            '}';
	}
}
