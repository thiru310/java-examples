package com.example.collections.compare;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentCompratorDto>{

	@Override
	public int compare(StudentCompratorDto o1, StudentCompratorDto o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}else if(o1.getAge() < o2.getAge()) {
			return -1;
		}else {
			return 0;
		}
		
	}

	

}
