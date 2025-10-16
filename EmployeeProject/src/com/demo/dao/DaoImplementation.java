package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.*;
import com.demo.service.*;

public class DaoImplementation implements EmpDao  {

	  static List<Employee> elist;
	    static {
	    	elist=new ArrayList<>();
	    	elist.add(new Employee(100,"Manjiri",45678,LocalDate.of(2024, 11, 12)));
	    	elist.add(new Employee(101,"Gauri",55678,LocalDate.of(2023, 11, 12)));
	    	elist.add(new Employee(103,"Kanchan",35678,LocalDate.of(2020, 11, 12)));
	    }
		@Override
		public boolean save(Employee e) {
			elist.add(e);
			return true;
			
		}
		@Override
		public List<Employee> findAll() {
			return elist;
		}
		@Override
		public Employee findById(int empid) {
			for(Employee e:elist) {
				if(e.getEmpid() == (empid)) {
					return e;
				}
			}
			return null;
		}
		@Override
		public Employee findByName(String ename) {
		    for (Employee e : elist) {
		        if (e.getEname().equals(ename)) {
		            return e;
		        }
		    }
		    return null;
		}
		@Override
		public boolean delById(int empid) {
		    return elist.removeIf(e -> e.getEmpid() == empid);
		}
		@Override
		public boolean delBySal(double sal) {
			return elist.removeIf(e -> e.getSal() == sal);
		}
		@Override
		public Employee findBySal(double sal) {
			for(Employee e1 : elist) {
				if(e1.getSal()==sal) {
					return e1; 
				}
			}
			return null;
		}
		@Override
		public List<Employee> sortBySal() {
		    List<Employee> lst = new ArrayList<>(elist);
		    // Sort by salary in ascending order using a Comparator
		    lst.sort((e1, e2) -> Double.compare(e1.getSal(), e2.getSal()));
		    return lst;
		}
		@Override
		public boolean UpdatedSalary(int eid, double sal) {
			int pos = elist.indexOf(new Employee(eid));
			if(pos!=-1) {
				Employee e =elist.get(pos);
				e.setSal(sal);
				return true;
			}
			return false;
		}

}
