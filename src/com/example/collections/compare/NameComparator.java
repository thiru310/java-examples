package com.example.collections.compare;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentCompratorDto>{

	@Override
	public int compare(StudentCompratorDto o1, StudentCompratorDto o2) {
		return o1.getName().compareTo(o2.getName());
		
	}

}
