package com.example.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Rani");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add("");
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
