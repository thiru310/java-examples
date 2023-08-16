package com.java.example.programs.basic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindTheNthHighestSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for N, for finding the Nth Salary :: ");
		int n = scan.nextInt();
		Map<String, Integer> map = new HashMap<>();
		map.put("anil", 1000);
		map.put("bhavana", 1300);
		map.put("michael", 1500);
		map.put("tom", 1600);
		map.put("ankit", 1200);
		map.put("daniel", 1700);
		map.put("james", 1600);
		
		Map.Entry<String, Integer> secondHighestSalary = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(n-1);
		
		System.out.println(secondHighestSalary);
		
		Map.Entry<Integer, List<String>> result = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry :: getValue, Collectors.mapping(Map.Entry :: getKey, Collectors.toList())))
		.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);
		
		System.out.println(result);
	}

}
