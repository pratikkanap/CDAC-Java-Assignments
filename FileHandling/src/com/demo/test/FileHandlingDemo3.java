package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo3 {

	public static void main(String[] args) {
		//open file in autoclosable resource block
		try (FileInputStream fis=new FileInputStream("file.txt");
				FileOutputStream fos=new FileOutputStream("filecopy.txt");){		
			int i = fis.read();
			while(i!=-1) {
				fos.write(i);
				i = fis.read();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 

}
