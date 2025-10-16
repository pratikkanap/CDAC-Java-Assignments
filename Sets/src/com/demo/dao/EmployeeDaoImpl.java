package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set<Employee> eset;
	static {
    	eset =new HashSet<>();
    	eset.add(new Employee(7,"M.S.Dhoni",LocalDate.of(2004,3,30),40000));
    	eset.add(new Employee(8,"R.Jadeja",LocalDate.of(2009,3,30),140000));
    	eset.add(new Employee(3,"S.Raina",LocalDate.of(2006,3,30),70000));
    	eset.add(new Employee(31,"Ruturaj",LocalDate.of(2019,3,30),145000));

	}
		
	@Override
	public boolean save(Employee e) {
		eset.add(e);
		return true;
	}

	@Override
	public Set<Employee> showAll() {
		return eset;
		
	}

	@Override
	public Employee findById(int empid) {
		for(Employee e:eset) {
			if(e.getEmpid()==empid) {
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee findByName(String empname) {
		for(Employee e1:eset) {
			if(e1.getEname().equals(empname)) {
				return e1;
			}
		}
		return null;
	}

	@Override
	public boolean removeById(int empid) {
	    return eset.removeIf(e -> e.getEmpid() == empid);
	}

	@Override
	public boolean removeByName(String ename) {
		return eset.removeIf(e -> e.getEname().equals(ename));
	}

	@Override
	public boolean removeBySalary(double sal) {
		
		return eset.removeIf(e->e.getSal() >= sal);
	}

	@Override
	public Employee findBySalary(double sal) {
		for(Employee e3:eset) {
			if(e3.getSal() == sal) {
				return e3;
			}
		}
		return null;
	}
	@Override
	public List<Employee> sortBySalary() {
	    List<Employee> elist = new ArrayList<>(eset);
	    elist.sort(Comparator.comparingDouble(Employee::getSal));
	    return elist;
	}
}



