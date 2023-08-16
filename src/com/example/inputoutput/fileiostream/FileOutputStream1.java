/**
 * 
 */
package com.example.inputoutput.fileiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author tpurusot
 *
 */
public class FileOutputStream1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the data to be saved into file");
		String data = scan.nextLine();
		
		System.out.println("Enter the number of length of the data to be saved");
		int len = scan.nextInt();
		
		System.out.println("Enter the offset to be set");
		int offset = scan.nextInt();
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\fullstring.txt");
			fos.write(data.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fos = new FileOutputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\StrigWithLength.txt");
			fos.write(data.getBytes(),offset,len);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void writeStringIntoFile(String data, int offset, int len) {
		try(FileOutputStream fos = new FileOutputStream("C:\\Thiru\\Workspace\\STS\\javatraining\\java_examples\\StrigWithLength.txt")){
			fos.write(data.getBytes(), offset, len);
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
