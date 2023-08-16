package com.java.example.programs.basic;

import java.util.Scanner;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int n=0, n1=1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numner of iterations");
		int noOfIter = scanner.nextInt();
		
		System.out.println(n+ " ");
		System.out.println(n1+ " ");
		for(int i=0; i < noOfIter; i++) {
			n2 = n + n1;
			n = n1;
			n1 = n2;
			System.out.println(n2+ " ");
			
		}
		
		

	}

}
