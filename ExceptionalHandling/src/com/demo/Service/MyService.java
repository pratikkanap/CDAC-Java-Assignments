package com.demo.Service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exceptions.NegativeSalaryException;

public class MyService {
		public void acceptData() throws NegativeSalaryException{
			Scanner sc = new Scanner(System.in);
			Employee emp=new Employee(30,"Aditya",4567);
			emp.setSal(-2000);
		}
}
