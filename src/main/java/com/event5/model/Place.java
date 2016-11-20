package com.event5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Place {
	String name;
	String id;
	Location location;
	
	public String getName() {
		return name;
	}
	
	public String getZip() {
		return id;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Place{" +
	            "name='" + name + '\'' +
	            ", location=" + location +
	            ", id=" + id + 
	            '}';
	}
}
