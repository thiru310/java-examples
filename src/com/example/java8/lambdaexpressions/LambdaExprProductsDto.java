/**
 * 
 */
package com.example.java8.lambdaexpressions;

import java.io.Serializable;

/**
 * @author tpurusot
 *
 */
public class LambdaExprProductsDto implements Serializable {
	
	int id;
	String name;
	float price;
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public LambdaExprProductsDto(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "LambdaExprProductsDto [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	

}
