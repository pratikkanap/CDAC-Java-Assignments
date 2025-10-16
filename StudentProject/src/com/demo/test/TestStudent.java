package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.Service.StudentService;
import com.demo.Service.StudentServiceImpl;
import com.demo.beans.Student;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		StudentService stud = new StudentServiceImpl();
		
		do {
			System.out.println("1.Add new Student\n 2.Display All\n 3.Search By Id\n 4.Search By Name");
			System.out.println("5.Update marks\n 6.Delete By Id\n 7.Delete By Name\n 8.Sort By id\n");
			System.out.println(" 9.Sort By Name\n 10.Exit\n Choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 ->{
				boolean status = stud.addNewStudent();
				if(status) {
					System.out.println("Added Successfully");
				}
				else {
					System.out.println("Addition Failed Successfully");
				}
			}
			case 2 ->{
				Set<Student> s = stud.displayAll();
				s.forEach(System.out::println);
			}
			case 3 ->{
				System.out.println("Enter student id to search");
				int studid = sc.nextInt();
				Student s1 = stud.searchById(studid);
				if(s1!=null) {
					System.out.println(s1);
				}
				else {
					System.out.println("Not Found");
				}
			}
		case 4 ->{
			System.out.println("Enter name to search");
			String sname = sc.next();
			Student s2  = stud.searchByName(sname);
			if(s2!=null) {
				System.out.println(s2);
			}
			else {
				System.out.println("Not Found");
			}
			
		}
		}
	}
		while(choice!=10);
	}
}
