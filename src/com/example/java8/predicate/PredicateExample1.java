package com.example.java8.predicate;

import java.util.function.Predicate;

public class PredicateExample1 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> greaterThan = (i) -> i > 10;
		
		Predicate<Integer> lowerThan = (i) -> i < 20;
		boolean result = greaterThan.and(lowerThan).negate().test(15);
		
		System.out.println(result);
		
		
		
	}

}
