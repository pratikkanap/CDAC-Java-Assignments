package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.DaoImplementation;
import com.demo.dao.EmpDao;

public class EmployeeServiceImpl implements EmployeeService {
	private EmpDao edao;
	public EmployeeServiceImpl() {
		
		 edao=new DaoImplementation();
	}
	

		@Override
		public boolean AddNewEmployee() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		int empid = sc.nextInt();
		System.out.println("Enter Employee Name :");
		String ename = sc.next();
		System.out.println("Enter Employee Salary :");
		double sal = sc.nextDouble();
		System.out.println("Enter Employee Joining Date :");
		String dt= sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern(dt="dd/MM/yyyy"));
		Employee e = new Employee(empid,ename,sal,ldt);
		return edao.save(e);
		
		
	}

		@Override
		public List<Employee> displayAll() {
			return edao.findAll();
		}


		@Override
		public Employee searchById(int eid) {
			return edao.findById(eid);
		}


		@Override
		public Employee searchByName(String ename) {
			// TODO Auto-generated method stub
			return edao.findByName(ename);
		}


		@Override
		public boolean deleteById(int empid) {
			return edao.delById(empid);
		}


		@Override
		public boolean deleteBySal(double sal) {
			// TODO Auto-generated method stub
			return edao.delBySal(sal);
		}


		@Override
		public Employee searchBySal(double sal) {
			// TODO Auto-generated method stub
			return edao.findBySal(sal);
		}

		@Override
		public List<Employee> sortBySal() {
			
			return edao.sortBySal();
		}


		@Override
		public boolean UpdateSal(int eid, double sal) {
			// TODO Auto-generated method stub
			return edao.UpdatedSalary(eid , sal);
		}


		

	


	
		
}
