package com.example.collections.compare;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparatorTest {

	public static void main(String[] args) {
		ArrayList<StudentCompratorDto> al = new ArrayList<StudentCompratorDto>();
		al.add(new StudentCompratorDto(101, 23, "Vijay"));
		al.add(new StudentCompratorDto(106, 27, "Ajay"));
		al.add(new StudentCompratorDto(105, 21, "Jai"));
		
		Collections.sort(al, new AgeComparator());
		
		System.out.println(al);
		
		
		Collections.sort(al, new NameComparator());
		System.out.println(al);

	}

}
