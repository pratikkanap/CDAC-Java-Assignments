package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			 fis = new FileInputStream("localfile.txt"); 
			 fos = new FileOutputStream("localfilecopy.txt");
			
			int i = fis.read();
			while(i!=-1) {
				fos.write(i);
				i = fis.read();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
