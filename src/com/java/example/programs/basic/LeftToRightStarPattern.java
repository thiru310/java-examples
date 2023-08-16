package com.java.example.programs.basic;

import java.util.Scanner;

public class LeftToRightStarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of Lines to print ::: ");
		int noOfLines = scan.nextInt();
		
		for(int i=0; i < noOfLines; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
