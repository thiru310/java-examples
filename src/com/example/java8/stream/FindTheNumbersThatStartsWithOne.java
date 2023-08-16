package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheNumbersThatStartsWithOne {

	public static void main(String[] args) {
		int[] arr = {5,9,11,2,8,21,1};
		
		List<String> strList = Arrays.stream(arr).boxed().map(s -> String.valueOf(s)).filter(x -> x.startsWith("1")).collect(Collectors.toList());
		System.out.println(strList);

	}

}
