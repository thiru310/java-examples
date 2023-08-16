/**
 * 
 */
package com.java.example.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author tpurusot
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchList {
	
	private String id;
	private int batch_num;
	private int is_open;
	private int processing_status_id;
	private String product_transaction_id;
	private int created_ts;
	private String settlement_file_name;
	private int batch_close_ts;
	private String batch_close_detail;
	private double total_sale_amount;
	private int total_sale_count;
	private double total_refund_amount;
	private int total_refund_count;
	private double total_void_amount;
	private int total_void_count;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBatch_num() {
		return batch_num;
	}
	public void setBatch_num(int batch_num) {
		this.batch_num = batch_num;
	}
	public int getIs_open() {
		return is_open;
	}
	public void setIs_open(int is_open) {
		this.is_open = is_open;
	}
	public int getProcessing_status_id() {
		return processing_status_id;
	}
	public void setProcessing_status_id(int processing_status_id) {
		this.processing_status_id = processing_status_id;
	}
	public String getProduct_transaction_id() {
		return product_transaction_id;
	}
	public void setProduct_transaction_id(String product_transaction_id) {
		this.product_transaction_id = product_transaction_id;
	}
	public int getCreated_ts() {
		return created_ts;
	}
	public void setCreated_ts(int created_ts) {
		this.created_ts = created_ts;
	}
	public String getSettlement_file_name() {
		return settlement_file_name;
	}
	public void setSettlement_file_name(String settlement_file_name) {
		this.settlement_file_name = settlement_file_name;
	}
	public int getBatch_close_ts() {
		return batch_close_ts;
	}
	public void setBatch_close_ts(int batch_close_ts) {
		this.batch_close_ts = batch_close_ts;
	}
	public String getBatch_close_detail() {
		return batch_close_detail;
	}
	public void setBatch_close_detail(String batch_close_detail) {
		this.batch_close_detail = batch_close_detail;
	}
	public double getTotal_sale_amount() {
		return total_sale_amount;
	}
	public void setTotal_sale_amount(double total_sale_amount) {
		this.total_sale_amount = total_sale_amount;
	}
	public int getTotal_sale_count() {
		return total_sale_count;
	}
	public void setTotal_sale_count(int total_sale_count) {
		this.total_sale_count = total_sale_count;
	}
	public double getTotal_refund_amount() {
		return total_refund_amount;
	}
	public void setTotal_refund_amount(double total_refund_amount) {
		this.total_refund_amount = total_refund_amount;
	}
	public int getTotal_refund_count() {
		return total_refund_count;
	}
	public void setTotal_refund_count(int total_refund_count) {
		this.total_refund_count = total_refund_count;
	}
	public double getTotal_void_amount() {
		return total_void_amount;
	}
	public void setTotal_void_amount(double total_void_amount) {
		this.total_void_amount = total_void_amount;
	}
	public int getTotal_void_count() {
		return total_void_count;
	}
	public void setTotal_void_count(int total_void_count) {
		this.total_void_count = total_void_count;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", batch_num=" + batch_num + ", is_open=" + is_open + ", processing_status_id="
				+ processing_status_id + ", product_transaction_id=" + product_transaction_id + ", created_ts="
				+ created_ts + ", settlement_file_name=" + settlement_file_name + ", batch_close_ts=" + batch_close_ts
				+ ", batch_close_detail=" + batch_close_detail + ", total_sale_amount=" + total_sale_amount
				+ ", total_sale_count=" + total_sale_count + ", total_refund_amount=" + total_refund_amount
				+ ", total_refund_count=" + total_refund_count + ", total_void_amount=" + total_void_amount
				+ ", total_void_count=" + total_void_count + "]";
	}
	
	
	
	
	
	
	

}
