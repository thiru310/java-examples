package com.java.example.programs.basic;

import java.util.Scanner;

public class PalindromeStringBufferExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check for Palindrome");
		String str = new String();
		str = scan.next();
		
		StringBuffer strBuffer = new StringBuffer(str);
		String reverseStr = strBuffer.reverse().toString();
		
		System.out.println("Original String :: "+str);
		System.out.println("Reverse String  :: "+reverseStr);
		
		if(str.equals(reverseStr)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is a not palindrome");
		}

	}

}
