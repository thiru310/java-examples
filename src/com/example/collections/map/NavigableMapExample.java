package com.example.collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		NavigableMap<Integer, String>  treemap = new TreeMap<Integer, String>((a,b) -> ((a > b) ? 1 : (a == b) ? 0 : -1));
		// populating tree map
        treemap.put(1, " A ");
        treemap.put(2, " B ");
        treemap.put(3, " C ");
        treemap.put(4, " D ");
        treemap.put(6, " E ");
        treemap.put(5, " F ");
        
        System.out.println(treemap);
        
        
        
        

	}

}
