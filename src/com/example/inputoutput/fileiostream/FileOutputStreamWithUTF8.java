package com.example.inputoutput.fileiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOutputStreamWithUTF8 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String to insert into file ");
		String str = scan.nextLine();
		FileOutputStream fos = new FileOutputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\StrigWithUT8.txt");
		
		try(OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8)){
			osw.write(str);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
