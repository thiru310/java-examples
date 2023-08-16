package com.java.example.programs.number;

import java.util.Scanner;

public class NumberToWord {
	
	public static String[] onesTens = new String[] {"",
			"One",
			"Two",
			"Three",
			"Four",
			"Five",
			"Six",
			"Seven",
			"Eight",
			"Nine",
			"Ten",
			"Eleven",
			"Twelve",
			"Thirteen",
			"Fourteen",
			"Fifteen",
			"Sixteen",
			"Seventeen",
			"Eighteen",
			"Nineteen"
			};
	
	public static String[] tens = new String[] {"",
			"",
			"Twenty",
			"Thirty",
			"Fourty",
			"Fifty",
			"Sixty",
			"Seventy",
			"Eighty",
			"Ninety"
			};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to convert to word");
		int num = scan.nextInt();
		
		System.out.println(convertNumberToWord(num));
		

	}
	
	private static String convertNumberToWord(int num) {
		if(num < 0) {
			return "minus "+num;
		}else if(num < 20) {
			return onesTens[num];
		}else if(num < 100) {
			String val = tens[num/10]+ (num%10 != 0 ? " " : "") + onesTens[num%10];
			return val;
		}else if(num < 1000) {
			return onesTens[num/100]+ " Hundred"+ (num%100 != 0 ? " " : "") + convertNumberToWord(num%100);
			
		}else if(num < 100000) {
			return tens[num/10000]+ " Thousand" + (num%1000 != 0 ? " " : "") + convertNumberToWord(num%1000);
		}
		return null;
		
	}

}
