package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		int choice = 0;
		do {
			System.out.println("1.Add new Empolyee\n 2.Display All\n 3.Search By Id");
			System.out.println("4.Search By Name\n 5.Update Salary\n 6.Delete By Id\n 7.Delete By Salary\n");
			System.out.println("8.Search By Salary\n 9.sort By Salary\n 10.Exit\n choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1 ->{
				boolean status = eservice.AddNewEmployee();
				if(status) {
					System.out.println("Added Successfully");
				}
				else {
					System.out.println("Not Found");
				}
			}
			case 2 ->{
				List<Employee> elist = eservice.displayAll();
					elist.forEach(System.out::println);	
					
			}
			case 3 ->{
				System.out.println("Enter ID to search :");
				int eid = sc.nextInt();
				Employee e = eservice.searchById(eid);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not Found");
				}
			}
			case 4 ->{
				System.out.println("Enter Name to Search");
				String ename = sc.next();
				Employee e1 = eservice.searchByName(ename);
				if(e1!=null) {
					System.out.println(e1);
				}
				else {
					System.out.println("Not Found");
				}
			}
			case 5 ->{
				System.out.println("Enter Id to Select Salary :");
				int eid = sc.nextInt();
				System.out.println("Enter Salary :");
				double sal = sc.nextDouble();
				boolean status = eservice.UpdateSal(eid , sal);
				if(status) {
					System.out.println("Updated Successfully");
				}
				else {
					System.out.println("Not Found");
				}
			}
			case 6 ->{
				System.out.println("Delete by Id is : ");
				int empid = sc.nextInt();
				boolean status = eservice.deleteById(empid);
				if(status) {
					System.out.println("Deleted Sucessfully");
				}else {
					System.out.println("Not Found ");
				}
				
			}
			case 7 ->{
				System.out.println("Enter Salary to delete :");
				double sal = sc.nextDouble();
				boolean status = eservice.deleteBySal(sal);
				if(status) {
					System.out.println("Deleted Sucessfully");
				}else {
					System.out.println("Not Found ");
				}
			}
			case 8 ->{
				System.out.println("Enter salary to search :");
				double sal =sc.nextDouble(); 
				Employee e2 = eservice.searchBySal(sal);
				if(e2!=null) {
					System.out.println(e2);
				}
				else {
					System.out.println("Not Found");
				}
			}
			case 9 ->{
				List<Employee> lst=eservice.sortBySal();
				lst.forEach(System.out::println);
			}
	
			case 10 ->{
				System.out.println("Thank you for visiting.....");
				sc.close();
			}
			}
		}
		while(choice!=10) ;
		
	}

}
