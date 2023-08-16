package com.example.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindNoOfDuplicateCharactersInString {

	public static void main(String[] args) {
		String str = "iloveshashanthandiwanthimtocometomesoon";
		
		Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
		
		List<String> duplicateElementList = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry :: getKey).collect(Collectors.toList());

		System.out.println(duplicateElementList);
		
		List<String> uniqueElementList = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry :: getKey).collect(Collectors.toList());

		System.out.println(uniqueElementList);
		
		String firstNonRepeatElement = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
				.entrySet().stream().filter(x-> x.getValue() == 1).findFirst().get().getKey();
		
		System.out.println(firstNonRepeatElement);
		
		String firstRepeatElement = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
				.entrySet().stream().filter(x-> x.getValue() > 1).findFirst().get().getKey();
		
		System.out.println(firstRepeatElement);
	}

}
