package com.example.inputoutput.fileiostream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\fullstring.txt");
		int val = fis.read();
		System.out.println("Value of the val :: "+val);
		System.out.println("*******");
		System.out.println("Value of the val into char ::: "+(char)val);
		
		
		int i = 0;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}

	}

}
