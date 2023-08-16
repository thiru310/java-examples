package com.java.example.programs.basic;

import org.apache.commons.lang3.mutable.MutableInt;

class Test {
	
	Integer value ;
	
	public Test(Integer val) {
		this.value = val;
	}

	@Override
	public String toString() {
		return "Test [value=" + value + "]";
	}
	
	
}

public class PassByReferenceExample {
	
	public static void modify(Test test) {
		test.value += 1000;
	}

	public static void main(String[] args) {
		Test test = new Test(500);
		modify(test);
		
		System.out.println(test);
		
		MutableInt intVal = new MutableInt();
		intVal.add(100);
		
		System.out.println(intVal);
		System.out.println(intVal.incrementAndGet());
		intVal.increment();
		System.out.println(intVal);

	}

}
