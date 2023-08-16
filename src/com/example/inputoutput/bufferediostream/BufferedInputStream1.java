package com.example.inputoutput.bufferediostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\StrigWithLength.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		while(bis.read() != -1) {
			System.out.print((char)bis.read());
		}

	}

}
