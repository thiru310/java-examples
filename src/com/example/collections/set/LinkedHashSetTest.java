package com.example.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Rani");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add(null);
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}


	}

}
