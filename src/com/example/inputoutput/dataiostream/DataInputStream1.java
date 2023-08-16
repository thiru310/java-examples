package com.example.inputoutput.dataiostream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis4 = new FileInputStream("C:\\Users\\tpurusot\\Downloads\\new 33.txt");
		DataInputStream dis = new DataInputStream(fis4);
		int count = fis4.available();
		System.out.println("Available :: "+count);
		
		byte[] ary = new byte[count];
		dis.read(ary);
		for(byte byt : ary) {
			System.out.print((char)byt);
		}
	}

}
