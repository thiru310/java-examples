package com.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100,"Amit");    
	    map.put(101,"Vijay");    
	    map.put(102,"Rahul"); 
	    
	    map.entrySet().stream().forEach(x -> System.out.println("Key :: "+x.getKey()+ "   -   Value :: "+x.getValue()));
	    
	    map.entrySet().forEach(y -> System.out.println("Key :: "+y.getKey()+ "   -   Value :: "+y.getValue()));
	    
	    

	}

}
