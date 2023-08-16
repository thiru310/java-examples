package com.java.example.programs.number;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to reverse :: ");
		int numToReverse = scan.nextInt();
		
		reveseUsingWhileLoop(numToReverse);
		reveseUsingForLoop(numToReverse);
		

	}
	
	private static int reveseUsingWhileLoop(int numToReverse) {
		int reverse = 0;
		while(numToReverse != 0) {
			int reminder = numToReverse % 10;
			reverse = (reverse*10)+reminder;
			numToReverse = numToReverse/10;
		}
		System.out.println("Variable Number using While Loop:: "+reverse);
		return reverse;
	}
	
	private static int reveseUsingForLoop(int numToReverse) {
		int reverse = 0;
		for(;numToReverse != 0; numToReverse=numToReverse/10) {
			int reminder = numToReverse % 10;
			reverse = (reverse*10)+reminder;
		}
		System.out.println("Variable Number using For Loop:: "+reverse);
		return reverse;
	}

}
