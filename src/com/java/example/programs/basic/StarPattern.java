package com.java.example.programs.basic;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of Lines to print ::: ");
		int noOfLines = scan.nextInt();
		
		for(int i=0; i<noOfLines; i++) {
			for(int j=(noOfLines-i); j>0; j--){
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


//Convert number to word java
