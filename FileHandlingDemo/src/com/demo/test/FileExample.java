package com.demo.test;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("example.txt");
		if(file.exists()) {
			System.out.println("File Exists");
		}else {
			System.out.println("File not  Exists");
		}
	}

}
