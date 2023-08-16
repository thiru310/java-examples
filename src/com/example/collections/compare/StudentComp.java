package com.example.collections.compare;

public class StudentComp implements Comparable<StudentComp>{

	private int rollno;
	private String name;
	private int age;
	
	
	
	
	/**
	 * @param rollno
	 * @param name
	 * @param age
	 */
	public StudentComp(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}




	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}




	@Override
	public int compareTo(StudentComp o) {
		if(this.rollno > o.rollno) {
			return 1;
		}		
		else if(this.rollno < o.rollno) {
			return -1;
		}else {
			return 0;
		}
		
	}

	
}
