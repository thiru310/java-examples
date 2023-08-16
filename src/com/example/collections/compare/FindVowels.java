package com.example.collections.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		List<String> vowelList = new ArrayList<>();
		vowelList.add("a");
		vowelList.add("e");
		vowelList.add("i");
		vowelList.add("o");
		vowelList.add("u");
		boolean isVowel = false;
		
		for (String string : vowelList) {
			if(input.contains(string)) {
				isVowel = true;
				break;
			}
		}	
		
		if(isVowel) {
			System.out.println("The input keyword :: "+ input + " :: is a Vowel");
		}else {
			System.out.println("The input keyword :: "+ input + " :: is not a Vowel");
		}
		
		
		
		List<String> strList = vowelList.stream().filter(x -> input.contains(x)).collect(Collectors.toList());
		System.out.println(strList);
		
		
		boolean value = vowelList.stream().anyMatch(x -> input.contains(x));
		System.out.println("Anymatch condition ::: "+value);
		
		
		boolean allmatchval = vowelList.stream().allMatch(x -> input.contains(x));
		System.out.println("All match Vowel :: "+allmatchval);

	}

}
