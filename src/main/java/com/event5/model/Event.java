package com.event5.model;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	String description;
	String name;
	String id;
	String street;
	Place place;
	LocalTime start_time, end_time;
	
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
	
	public LocalTime getStartTime() {
		return start_time;
	}
	
	public LocalTime getEndTime() {
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
	
	public void setStartTime(LocalTime start_time) {
		this.start_time = start_time;
	}
	
	public void setEndTime(LocalTime end_time) {
		this.end_time = end_time;
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
