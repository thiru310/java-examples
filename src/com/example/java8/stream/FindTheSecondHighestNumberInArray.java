package com.example.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSecondHighestNumberInArray {

	public static void main(String[] args) {
		int[] number = {5,9,11,2,8,21,1};
		
		List<Integer> intList = Arrays.stream(number).boxed().sorted().collect(Collectors.toList());
		
		System.out.println(intList);
		
		List<Integer> numberList = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(numberList);
		
		List<Integer> numberListSkipFirst = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
		System.out.println(numberListSkipFirst);
		
		Integer secondLargest = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargest);
		
		

	}

}
