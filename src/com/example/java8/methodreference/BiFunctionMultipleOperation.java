package com.example.java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionMultipleOperation {

	public static void main(String[] args) {
		String result1 = convert(2, 4, (a,b) -> Math.pow(a, b),  (r) -> "Result : "+String.valueOf(r));
		System.out.println("Result 1 : "+result1);

	}
	
	public static <A1, A2, R1, R2>R2 convert(A1 a, A2 b, BiFunction<A1, A2, R1> func1, Function<R1, R2> func2) {
		return func1.andThen(func2).apply(a, b);
		
	}

}
