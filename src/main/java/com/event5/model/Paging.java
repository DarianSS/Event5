package com.event5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Paging {
	Cursors cursors;
	String next;
	
	public Cursors getCursors() {
		return cursors;
	}
	
	public String getNext() {
		return next;
	}
	
	public void setCursors(Cursors cursors) {
		this.cursors = cursors;
	}
	
	public void setNext(String next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Paging{" +
				"cursors=" + cursors + 
				", next='" + next + '\'' + 
	            '}';
	}
}
