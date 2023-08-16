package com.example.inputoutput.sequenceiostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class SequenceInputStream1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\fullstring.txt");
		FileInputStream fis1 = new FileInputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\StrigWithLength.txt");
		FileInputStream fis2 = new FileInputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\StrigWithUT8.txt");
		FileInputStream fis3 = new FileInputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\BufferedOutputStream1.txt");
		FileInputStream fis4 = new FileInputStream("C:\\Users\\tpurusot\\Downloads\\new 33.txt");
		
		Vector v = new Vector<>();
		v.add(fis);
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		
		Enumeration<FileInputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		int i = 0;
		while((i=sis.read()) != -1) {
			System.out.print((char)i);
		}
	}

}
