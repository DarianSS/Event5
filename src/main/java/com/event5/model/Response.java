package com.event5.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	List<Event> data;
	Paging paging;
	
	public List<Event> getData() {
		return data;
	}
	
	public Paging getPaging() {
		return paging;
	}
	
	public void setData(List<Event> data) {
		this.data = data;
	}
	
	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	
	@Override
	public String toString() {
		return "Response{" +
				"data=" + data +
				", paging=" + paging + 
	            '}';
	}
}
