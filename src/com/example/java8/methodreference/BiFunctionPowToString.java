package com.example.java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionPowToString {

	public static void main(String[] args) {
		String result = powToString(2, 2, (a,b) -> Math.pow(a, b), (r) -> "Result : "+String.valueOf(r));
		
		System.out.println(result);

	}
	
	public static <T> T powToString(Integer a, Integer b, BiFunction<Integer, Integer, Double> func1, Function<Double, T> func2) {
		return func1.andThen(func2).apply(a, b);
		
	}

}
