package com.example.file;

import java.io.File;
import java.nio.file.Path;

public class FileRead {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\tpurusot\\Downloads\\PRIYANKA RESUME 2023 (1).docx.draft");
		System.out.println(file.isFile());

	}

}
