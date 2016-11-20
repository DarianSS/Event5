package com.event5.model;

import java.util.List;

public class Data {
	private List<Event> data;
	
	public Data(List<Event> data) {
		this.data = data;
	}
	
	public List<Event> getData() {
		return data;
	}
}
