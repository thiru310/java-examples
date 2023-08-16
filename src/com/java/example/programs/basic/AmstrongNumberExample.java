package com.java.example.programs.basic;

import java.util.Scanner;

public class AmstrongNumberExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check it is palindrome or not : ");
		int num = scan.nextInt();
		
		int digits=0;
		int temp = num;
		while(temp > 0) {
			temp = temp/10;
			System.out.println(temp);
			++digits;
			
		}
		System.out.println("Value of digits :: "+digits);
		int sum = 0; 
		 while(num > 0) {
			int reminder = num%10;
			sum += Math.pow(reminder, digits);
			num = num/10;
		 }
		 
		 System.out.println("Value of Sum :: "+sum);
		
	}

}
