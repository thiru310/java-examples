package com.example.java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndFunctionExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> func1 = (a, b) -> (Double.valueOf(a+b));
		
		Function<Double, String> func2 = (input) -> "Result : "+String.valueOf(input);
		
		String result = func1.andThen(func2).apply(12, 13);
		
		System.out.println(result);

	}

}
