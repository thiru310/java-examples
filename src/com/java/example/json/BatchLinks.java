package com.java.example.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchLinks {

	
	private String type;
	private String first;
	private String last;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "[type=" + type + ", first=" + first + ", last=" + last + "]";
	}
	 
	
	
}
