package com.java.example.json.practise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	
	private static final String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    
    //instance variables
    private String name;
    private int age;
    
    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public static void main(String[] args) {
       System.out.println("Current Date :: "+date);
    	Person p1 = new Person("John", 25); // "p1" is object refrence in stack pointing to the object in the heap
        String greeting = "Hello";         // "greeting" is a reference in stack pointing to an Object in Heap String pool
        p1.addOneAndPrint(greeting);
    }
    
    public void addOneAndPrint(String param) {
        int valToAdd = 1;                        // local primitive variable in stack
        this.age  = this.age + valToAdd;         // instance variable in heap is mutated to 26 via "param" reference in stack
        System.out.println(param + "! " + this); // calls toString() method
    }
 
    @Override
    public String toString() {
        return name + " you are now " + age;
    }
}
