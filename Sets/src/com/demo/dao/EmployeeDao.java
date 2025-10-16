package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> showAll();

	Employee findById(int empid);

	Employee findByName(String empname);

	boolean removeById(int empid);

	boolean removeByName(String ename);

	boolean removeBySalary(double sal);

	Employee findBySalary(double sal);

	List<Employee> sortBySalary();



}
