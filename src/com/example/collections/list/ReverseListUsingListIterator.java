package com.example.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseListUsingListIterator {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("Thiru");
		strList.add("Dhiva");
		strList.add("Shashanth");
		strList.add("Anusha");
		strList.add("Rani");
		
		ListIterator<String> strListItr = strList.listIterator();
		while(strListItr.hasPrevious()) {
			System.out.println("Value ::: "+strListItr.previousIndex());
			System.out.println(strListItr.previous());
		}

	}

}
