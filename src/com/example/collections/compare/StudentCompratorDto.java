package com.example.collections.compare;

public class StudentCompratorDto {
	
	private int rollno;
	private int age;
	private String name;
	/**
	 * @param rollno
	 * @param age
	 * @param name
	 */
	public StudentCompratorDto(int rollno, int age, String name) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentCompratorDto [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}
	
	

}
