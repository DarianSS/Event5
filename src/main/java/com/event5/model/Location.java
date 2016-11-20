package com.event5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	String city;
	String country;
	String zip;
	double latitude;
	double longitude;
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getZip() {
		return zip;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString() {
		return "Location{" + 
				"city='" + city + '\'' +
				", country='" + country + '\'' +
				", latitude=" + latitude +
				", longitude=" + longitude +
				", zip='" + zip + '\'' + 
				'}';
	}
}
