package com.java.example.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchSort {

	private String type;
	private List<SortFields> fields;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<SortFields> getFields() {
		return fields;
	}
	public void setFields(List<SortFields> fields) {
		this.fields = fields;
	}
	@Override
	public String toString() {
		return "[type=" + type + ", fields=" + fields + "]";
	}
	
	
}
