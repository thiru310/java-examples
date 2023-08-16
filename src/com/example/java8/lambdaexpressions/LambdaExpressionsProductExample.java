package com.example.java8.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionsProductExample {

	public static void main(String[] args) {
		List<LambdaExprProductsDto> prodList = new ArrayList<LambdaExprProductsDto>();
		prodList.add(new LambdaExprProductsDto(1,"HP Laptop",25000f));
		prodList.add(new LambdaExprProductsDto(3,"Keyboard",300f));
		prodList.add(new LambdaExprProductsDto(2,"Dell Mouse",150f));
		
		Collections.sort(prodList, (p1,p2)->{
			return p1.name.compareTo(p2.name);
		});

		System.out.println(prodList.toString());
	}

}
