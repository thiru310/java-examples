package com.java.example.programs.basic;

import java.util.Scanner;

public class PlaindromeStringExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check for Palindrome");
		String str = new String();
		str = scan.next();
		
		char[] str1 = str.toCharArray();
		String reverse = "";
		for(int i=str.length()-1; i>=0;i--) {
			reverse = reverse + str1[i];
		}
		System.out.println("Original  Value :: "+str);
		System.out.println("Reverse Value :: "+reverse);
		
		if(str.equals(reverse)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is a not palindrome");
		}
		

	}

}
