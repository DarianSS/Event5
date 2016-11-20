package com.event5.utils;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.AddressComponent;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

public class LocationUtils {
	static GeocodingResult[] results = null;
	static GeoApiContext context = new GeoApiContext();
	
	public static String getCity(double latitude, double longitude) {
		context.setApiKey("AIzaSyBgcoXm_hB8HvwZ5l2UVFl6wk0qcN8h8Yg");
		LatLng coords = new LatLng(latitude, longitude);
		
		try {
			results =  GeocodingApi.reverseGeocode(context, coords).await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		AddressComponent[] values = results[0].addressComponents;
		
		return results[0].formattedAddress;
	}
}
