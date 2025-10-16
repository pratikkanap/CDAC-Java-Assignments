package com.demo.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestNIOClasses {

	public static void main(String[] args) {
		try {
			Path p = Paths.get("empcsv.csv");
			
			List<String> lst = Files.readAllLines(p);
			
			for(String s: lst) {
				String[] str = s.split(" , ");
				System.out.println(str[0]+"----"+str[1]+"----"+str[2]);
			}
			System.out.println("Employee that has salary > ");
			for(String s:lst) {
				String[] str = s.split(",");
				if(Double.parseDouble(str[2])>14000) {
					System.out.println(str[0]+"-----"+str[1]+"----"+str[2]);
				}
			}
				}catch(FileNotFoundException e) {
					System.out.println(e.getMessage());
				}
				catch(IOException e) {
						System.out.println("Error in reading");
				}
		}
		
	}

