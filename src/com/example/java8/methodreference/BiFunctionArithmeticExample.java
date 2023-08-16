package com.example.java8.methodreference;

import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a , int b) {
		return a + b;
	}
}

public class BiFunctionArithmeticExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = Arithmetic :: add;
		Integer result = add.apply(25, 30);
		System.out.println(result);

	}

}
