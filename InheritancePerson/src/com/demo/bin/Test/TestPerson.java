package com.demo.bin.Test;

import java.util.Date;

import com.demo.bin.Employee;
import com.demo.bin.SalariedEmp;

public class TestPerson {

	public static void main(String[] args) {
			SalariedEmp s1 = new SalariedEmp("T", 31, new Date(31/10/2025), "Developer", "Development", 30000, 10); 
			System.out.println("The Data for the Salaried Employee is :"+s1);
			
			//System.out.println("The Employee Data : ");
			//Employee e = new Employee("TT",31,new Date(31/10/2023),"Automation Tester","Development");
			//System.out.println(e);
	}

}
