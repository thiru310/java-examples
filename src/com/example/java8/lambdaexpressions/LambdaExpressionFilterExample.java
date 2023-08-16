package com.example.java8.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionFilterExample {

	public static void main(String[] args) {
		List<LambdaExprProductsDto> arrList = new ArrayList<>();
		arrList.add(new LambdaExprProductsDto(1, "Samsung A5", 17000f));
		arrList.add(new LambdaExprProductsDto(3, "Iphone 6S", 65000f));
		arrList.add(new LambdaExprProductsDto(2, "Sony Xperia", 25000f));
		arrList.add(new LambdaExprProductsDto(4, "Nokia Lumia", 15000f));
		arrList.add(new LambdaExprProductsDto(5, "Redmi4 ", 26000f));
		arrList.add(new LambdaExprProductsDto(6, "Lenevo Vibe", 19000f));
		
		List<LambdaExprProductsDto> filteredList = arrList.stream().filter(p -> p.price > 25000).collect(Collectors.toList());

		System.out.println(filteredList.toString());
	}

}
