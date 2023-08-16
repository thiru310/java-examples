package com.java.example.programs.basic;

import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		int r, sum=0, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to check for Palindrome: ");
		int num = scan.nextInt();
		
		temp = num;
		
		while(num > 0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}

		if(temp == sum) {
			System.out.println(temp+" is a palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}
	}

}
