package com.example.collections.compare;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparableTest {

	public static void main(String[] args) {
		ArrayList<StudentComp> al=new ArrayList<StudentComp>();  
		al.add(new StudentComp(101,"Vijay",23));  
		al.add(new StudentComp(106,"Ajay",27));  
		al.add(new StudentComp(105,"Jai",21)); 
		
		Collections.sort(al);
		for(StudentComp st:al){  
			System.out.println(st.toString());  
		}

	}

}
