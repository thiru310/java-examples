package com.example.inputoutput.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Reader1 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:\\Users\\tpurusot\\Downloads\\new 33.txt");
		int data = reader.read();
		while(data != -1) {
			System.out.print((char)data);
			data = reader.read();
		}
		reader.close();

	}

}
