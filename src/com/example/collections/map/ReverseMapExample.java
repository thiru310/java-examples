package com.example.collections.map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ReverseMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Sravan Kumar");
		map.put(2, "Ishitha");
		map.put(3, "Harsha");
		map.put(4, "Vamsi");
		map.put(5, "Jyothika");

		Map<Integer, String> linHashMap = map.entrySet().stream().sorted(Collections.reverseOrder()).collect(Collectors.toMap(Entry :: getKey, Entry :: getValue));
		System.out.println(linHashMap);
	}

}
