package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpDao  {
	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int empid);

	Employee findByName(String ename);

	boolean delById(int eid);

	boolean delBySal(double sal);

	Employee findBySal(double sal);

	List<Employee> sortBySal();

	boolean UpdatedSalary(int eid, double sal);

}
