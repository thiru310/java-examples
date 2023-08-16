package com.example.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class FindTheLargestStringFromArray {

	public static void main(String[] args) {
		String[] arr = {"java", "techie", "springboot", "microservices", "amazonwebservices", "docker8aws"};
		
		String longestValue = Arrays.stream(arr).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longestValue);

	}

}
