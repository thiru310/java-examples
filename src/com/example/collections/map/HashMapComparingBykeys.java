package com.example.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapComparingBykeys {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Amit");
		map.put(100, "Vijay");
		map.put(102, "Rahul");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.println("Key :: "+x.getKey()+ "  :::  value : "+x.getValue()));

		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(x -> System.out.println("Key :: "+x.getKey()+ "  :::  value : "+x.getValue()));
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(x -> System.out.println("Key :: "+x.getKey()+ "  :::  value : "+x.getValue()));
	}

}
