package com.java.example.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchPagination {

	private String type;
	private int total_Count;
	private int page_Count;
	private int page_Number;
	private int page_Size;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotal_Count() {
		return total_Count;
	}
	public void setTotal_Count(int total_Count) {
		this.total_Count = total_Count;
	}
	public int getPage_Count() {
		return page_Count;
	}
	public void setPage_Count(int page_Count) {
		this.page_Count = page_Count;
	}
	public int getPage_Number() {
		return page_Number;
	}
	public void setPage_Number(int page_Number) {
		this.page_Number = page_Number;
	}
	public int getPage_Size() {
		return page_Size;
	}
	public void setPage_Size(int page_Size) {
		this.page_Size = page_Size;
	}
	@Override
	public String toString() {
		return "[type=" + type + ", total_Count=" + total_Count + ", page_Count=" + page_Count
				+ ", page_Number=" + page_Number + ", page_Size=" + page_Size + "]";
	}
	
	
}
