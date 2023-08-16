package com.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBucketIndexCalucalation {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Thiru");
		
		Integer a = new Integer(100);
		int index = a.hashCode();
		System.out.println("Vaule of the index ::: "+index);
		int b = index & (16-1);
		System.out.println("value of b :: "+b);

	}

}
