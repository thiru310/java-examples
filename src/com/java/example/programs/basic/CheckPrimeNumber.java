package com.java.example.programs.basic;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int m=0,flag=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be checked ");
		int num = scan.nextInt();
		
		m = num/2;
		
		if(num == 0 || num == 1) {
			System.out.println(num+ " is not a prime number");
		}else {
			for(int i=2; i<=m; i++) {
				if(num%i == 0) {
					System.out.println(num+ " is not a prime number");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(num+ " is a prime number");
			}
		}
		
		
	}

}
