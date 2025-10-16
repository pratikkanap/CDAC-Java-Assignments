package com.demo.tests;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
public class TestEmployee {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			EmployeeService eserv = new EmployeeServiceImpl();
			//Set<Employee> eset = new HashSet<>();
			int choice = 0;
			do {
				System.out.println("1.Add new Empolyee\n 2.Display All\n 3.Search By Id");
				System.out.println("4.Search By Name\n 5.Update Salary\n 6.Delete By Id\n 7.Delete By Name");
				System.out.println("8. Delete By Salary \n 9.Search By Salary\n 10.sort By Salary\n 11.-------Exit-------\n choice:");
				
				choice = sc.nextInt();
				switch(choice) {
				case 1 ->{
					System.out.println("Add New Employee");
					boolean status = eserv.addNewEmployee();
					if(status) {
						System.out.println("Added Successfully");
					}
					else {
						System.out.println("Not Found");
					}
				}
				case 2 ->{
					Set<Employee> eset = eserv.displayAll();
					System.out.println("display all the Employee");
					eset.forEach(System.out::println);
				}
				case 3->{
						System.out.println("Enter id for search");
						int empid = sc.nextInt();
						Employee e = eserv.searchById(empid);
							if(e!=null) {
								System.out.println(e);
						}else {
							System.out.println("Not Found");
						}
					}
				case 4 ->{
					System.out.println("Search By Name");
					String empname = sc.next();
					Employee e1 = eserv.searchByName(empname);
					if(e1!=null) {
						System.out.println(e1);
					}
					else {
						System.out.println("Not Found");
					}
				}
				case 6 ->{
					System.out.println("Enter Employee id for removal ");
					int empid = sc.nextInt();
					boolean status = eserv.deleteById(empid);
					if(status) {
						System.out.println("Deleted by id Sucessfully");
					}else {
						System.out.println("Not Found ");
					}
				}
				case 7 ->{
					System.out.println("Enter Name to Remove Employee");
					String ename = sc.next();
					boolean status = eserv.deleteByName(ename);
					if(status) {
						System.out.println("Deleted by Name successfully");
					}else {
						System.out.println("Not Found");
					}
					
				}
				case 8 ->{
					System.out.println("Enter Salary to delete");
					double sal = sc.nextDouble();
					boolean status = eserv.deleteBySalary(sal);
					if(status) {
						System.out.println("Delete by salary successfully");
					}
					else {
						System.out.println("Not found");
					}
				}
				case 9 ->{
					System.out.println("Enter Salary to search");
					double sal = sc.nextDouble();
					Employee e4 = eserv.searchBySalary(sal);
					if(e4!=null) {
						System.out.println(e4);
					}
					else {
						System.out.println("Not Found");
					}
				}
				case 10 ->{
					System.out.println("Sorting by salary");
					List<Employee> elist = eserv.sortBySal();
					elist.forEach(System.out::println);
					
				}
				case 11 ->{
						System.out.println("Thanks for visiting ....");
					}
				default ->{
						System.out.println("--------Invalid Choice---------");
					}
				}
			}while(choice !=11);
	}

}
