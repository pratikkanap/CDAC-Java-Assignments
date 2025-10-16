package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class TestList {

	public static void main(String[] args) {
			List<Employee> elist = new ArrayList<>();
//			private int eid;
//			private String ename;
//			private String desg;
//			private String dept;
//			private Double Sal;
			elist.add(new Employee(10,"first","WebDEV","Engineer",30000));
			elist.add(new Employee(11,"second","WebDev","Engineer",40000));
			for(Employee e:elist) {  
				System.out.println(e); 
			}	
			System.out.println("----------------------------------------------------");
			Iterator<Employee> it = elist.iterator();
			while(it.hasNext()) {
				Employee e = it.next();
				System.out.println(e);
			}
			System.out.println("----------------------------------------------------");
			ListIterator<Employee> lt = elist.listIterator();
			
			//1.8
			elist.forEach(System.out::println);
			
			System.out.println("----------------------------------------------------");
			//Search By Id
			int id =11;
			Optional<Employee> op = elist.stream().filter(emp->emp.getEid()==id).findFirst();
			if(op.isPresent()) {
				System.out.println(op.get());
			}
			else {
				System.out.println("Not Found");
			}
		}
			
	}

