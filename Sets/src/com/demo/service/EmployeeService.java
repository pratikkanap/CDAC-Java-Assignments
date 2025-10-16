package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	Set<Employee> displayAll();

	Employee searchById(int empid);

	Employee searchByName(String empname);

	boolean deleteById(int empid);

	boolean deleteByName(String ename);

	boolean deleteBySalary(double sal);

	Employee searchBySalary(double sal);

	List<Employee> sortBySal();

	

}
