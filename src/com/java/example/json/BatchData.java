package com.java.example.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchData {
	
	private String type;
	private List<BatchList> list;
	private BatchLinks links;
	private BatchPagination pagination;
	private BatchSort sort;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<BatchList> getList() {
		return list;
	}
	public void setList(List<BatchList> list) {
		this.list = list;
	}
	public BatchLinks getLinks() {
		return links;
	}
	public void setLinks(BatchLinks links) {
		this.links = links;
	}
	public BatchPagination getPagination() {
		return pagination;
	}
	public void setPagination(BatchPagination pagination) {
		this.pagination = pagination;
	}
	public BatchSort getSort() {
		return sort;
	}
	public void setSort(BatchSort sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "[type=" + type + ", list=" + list + ", links=" + links + ", pagination=" + pagination
				+ ", sort=" + sort + "]";
	}
	
	

}
