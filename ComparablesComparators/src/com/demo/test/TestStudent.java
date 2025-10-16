package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.ServiceImplement;
import com.demo.service.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Enter the details of students-------");
		
		StudentService studservice = new ServiceImplement();

		int choice = 0;
		do {
		     System.out.println("1.Add Student \n 2.Display Students \n 3. search by student id \n");
		     System.out.println("4. Search by Student Name \n 5. Update Marks \n 6.Delete by Student ID");
		     System.out.println("7. Delete by average marks \n 8. Sort by ID \n 9. Sort by Name");
		     System.out.println("10. Sort by Marks \n  11. Exit \n");
		     System.out.println("----------Enter the next choice---------- ");
		     System.out.print("CHOICE : ");
		     choice = sc.nextInt();
		     
		     
		     //switch case for Entering the choice
		     switch(choice) {
		     case 1 -> {
		    	 	boolean status = studservice.AddStud();
		    	 	if(status) {
		    	 		System.out.println("Added Successfully!");
		    	 	}else {
		    	 		System.out.println("Not Found !");
		    	 	}
		     	}
		     case 2 ->{
		    	 List<Student> lst = studservice.DisplayStudent();
		    	 		lst.forEach(System.out::println);
		     }
		     case 3 ->{
		    	 System.out.println("Enter ID to Search :");
		    	 int studid = sc.nextInt();
		    	 Student s = studservice.searchById(studid);
		    	 if(s!=null) {
		    		 System.out.println(s);
		    	 }
		    	 else {
		    		 System.out.println("Not Found");
		    	 }
		     }
		     case 4 ->{
		    	 System.out.println("Enter Student name to search :");
		    	 String studname = sc.next();
		    	 Student s1 = studservice.searchByName(studname);
		    	 if(s1!=null) {
		    		 System.out.println(s1);
		    	 }
		    	 else {
		    		 System.out.println("Not Found");
		    	 }
		     }
		     case 5 ->{
		    	 System.out.println("Enter id to Update marks :");
		    	 int studid = sc.nextInt();
		    	 double m1 = sc.nextDouble();
		    	 Student s2 = studservice.updateMarks(studid , m1);
		    	 if(s2!=null) {
		    		 System.out.println(s2);
		    	 }
		    	 else {
		    		 System.out.println("Not Found");
		    	 }
		     }
		     case 11 ->{
		    	 System.out.println("Thank you for visiting....");
		    	 sc.close();
		     }
		    }
		  
		}while(choice!=11); 
		

	}

}
