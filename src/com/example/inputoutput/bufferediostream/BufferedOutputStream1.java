package com.example.inputoutput.bufferediostream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\BufferedOutputStream1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Welcome to java programming, BufferedOutputstream example";
		bos.write(s.getBytes());
		bos.flush();
		bos.close();
		fos.close();

	}

}
