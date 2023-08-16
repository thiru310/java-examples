package com.example.collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentComparatorComparingFunction {

	public static void main(String[] args) {
		ArrayList<StudentCompratorDto> al = new ArrayList<StudentCompratorDto>();
		al.add(new StudentCompratorDto(101, 23, "Vijay"));
		al.add(new StudentCompratorDto(106, 27, "VijayaRaghavan"));
		al.add(new StudentCompratorDto(106, 27, "VijayaRaghavanS"));
		al.add(new StudentCompratorDto(105, 21, "VijayaSundar"));
		
		Comparator ageComparator = Comparator.comparing(StudentCompratorDto :: getAge).thenComparing(StudentCompratorDto :: getName);
		Collections.sort(al, ageComparator);
		
		System.out.println(al);

	}

}
