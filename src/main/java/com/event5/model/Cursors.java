package com.event5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cursors {
	String before, after;
	
	public String getBefore() {
		return before;
	}
	
	public String getAfter() {
		return after;
	}
	
	public void setBefore(String before) {
		this.before = before;
	}
	
	public void setAfter(String after) {
		this.after = after;
	}
	
	@Override
	public String toString() {
		return "Cursors{" +
				"before='" + before + '\'' +
				", after='" + after + '\'' + 
	            '}';
	}
}
