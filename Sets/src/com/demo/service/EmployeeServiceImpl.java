package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	public EmployeeServiceImpl(){
		 edao = new EmployeeDaoImpl();
	};
	
	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID :");
		int empid = sc.nextInt();
		System.out.println("Enter Employee Name :");
		String ename = sc.next();
		System.out.println("Enter Employee Salary :");
		double sal = sc.nextDouble();
		System.out.println("Enter Employee Joining Date :");
		String djt= sc.next();
		LocalDate ldt = LocalDate.parse(djt,DateTimeFormatter.ofPattern(djt="dd/MM/yyyy"));
		Employee e = new Employee(empid,ename,ldt,sal);
		return edao.save(e);
	}

	@Override
	public Set<Employee> displayAll() {
		
		return edao.showAll();
	}

	@Override
	public Employee searchById(int empid) {
		return edao.findById(empid);
	
	}

	@Override
	public Employee searchByName(String empname) {
		// TODO Auto-generated method stub
		return edao.findByName(empname);
	}

	@Override
	public boolean deleteById(int empid) {
		// TODO Auto-generated method stub
		return edao.removeById(empid);
	}

	@Override
	public boolean deleteByName(String ename) {
		
		return edao.removeByName(ename);
	}

	@Override
	public boolean deleteBySalary(double sal) {
		return edao.removeBySalary(sal);
	}


	@Override
	public List<Employee> sortBySal() {
		// TODO Auto-generated method stub
		return edao.sortBySalary();
	}

	@Override
	public Employee searchBySalary(double sal) {
		// TODO Auto-generated method stub
		return edao.findBySalary(sal);
	}

	
}
