package com.example.inputoutput.printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\printstream1.txt ");
		PrintStream pout = new PrintStream(fout);
		pout.print(2016);
		pout.print("Hello Java");
		pout.print("Welcome to Java");
		pout.close();
		fout.close();
		System.out.println("Success?");
	}
}