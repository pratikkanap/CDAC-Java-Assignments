package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean AddNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	Employee searchByName(String ename);

	//boolean deleteById(int eid);

	boolean deleteById(int empid);

	boolean deleteBySal(double sal);

	Employee searchBySal(double sal);

	

	List<Employee> sortBySal();

	boolean UpdateSal(int eid, double sal);
	
}
