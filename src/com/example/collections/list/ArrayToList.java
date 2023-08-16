package com.example.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToList {

	public static void main(String[] args) {
		String[] strarr = {"Apple", "Banana", "CustardApple", "DragonFruit"};
		convertArrayToList1(strarr);
		convertArrayToList2(strarr);

	}
	
	public static void convertArrayToList1(String[] arr) {
		List<String> arrList = Arrays.asList(arr);
		System.out.println(arrList instanceof List);
		System.out.println(arrList);
	}
	
	public static void convertArrayToList2(String[] arr) {
		List<String> arrList = Stream.of(arr).collect(Collectors.toList());
		System.out.println(arrList instanceof List);
		System.out.println(arrList);
	}

}
