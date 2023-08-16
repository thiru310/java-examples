package com.example.xml;

public class SplitFirstUnderScore {

	public static void main(String[] args) {
		String s = "A7194279900_bc_dev_ml-SF4KwpU0mI893KNcelaa_.pdf";
		
		String str = s.substring(s.indexOf("_")+1, s.length()).replace("-", ":");
		
		
		String myWord = "AAAAAasdas";
		String toReplace = "AA";
		String replacement = "BBB";

		int start = myWord.lastIndexOf(toReplace);
		
		
		
		myWord=myWord.replaceAll("AA(?!A)","BB");
		
		System.out.println(myWord);
		
		System.out.println(str);

	}

}
