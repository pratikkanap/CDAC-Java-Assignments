package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) {
			File f = new File("myfiledemo.txt");
			FileOutputStream fos = null;
			try {
				if(f.exists()) {
					fos = new FileOutputStream("myfiledemocopy.txt",true);	
				}else {
					fos = new FileOutputStream("myfiledemocopy.txt");
				}	
			}catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}try (FileInputStream fis=new FileInputStream("myfiledemo.txt");FileOutputStream fos1=fos;){
				int i = fis.read();
				while(i!=-1) {
					fos.write(i);
					i = fis.read();
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
	}

}
