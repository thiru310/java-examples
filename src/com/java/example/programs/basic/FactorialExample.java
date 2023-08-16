package com.java.example.programs.basic;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a Number to check factorial :: ");
			int num = scan.nextInt();
			int fact = 1;
			for(int i=num; i > 0; i--) {
				fact = fact * i;
			}
			System.out.println(" Value of the fact :: "+fact);
		}

	}

}
