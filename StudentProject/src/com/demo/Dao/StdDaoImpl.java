package com.demo.Dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.demo.beans.Student;

public class StdDaoImpl implements StudentDao {
	static Set<Student> sSet;
	static {
		sSet = new HashSet<>();
		sSet.add(new Student(10,"Pratik",LocalDate.of(2024, 10, 05),10,12,15,14));
		sSet.add(new Student(11,"Rohit",LocalDate.of(2024, 11, 15),10,12,15,19));
		sSet.add(new Student(12,"Sachin",LocalDate.of(2024, 9, 25),10,15,17,16));
	}
	@Override
	public boolean save(Student s) {
		sSet.add(s);
		return true;
	}
	@Override
	public Set<Student> displayData() {
		return sSet;
	}
	@Override
	public Student findById(int studid) {
		for(Student s : sSet){
			if(s.getStudid()==studid) {
				return s;
			}
		}
		
		Optional<Student> ob= sSet.stream().filter(e->e.getStudid()==studid).findFirst();
		 if(ob.isPresent()) {
			 return ob.get();
			 }
		return null;
		}
	@Override
	public Student findByName(String sname) {
		for(Student s : sSet) {
			if(s.getStudname().equals(sname)) {
				return s;
			}
		}
		Optional<Student> ob= sSet.stream().filter(e->e.getStudname().equals(sname)).findFirst();
		 if(ob.isPresent()) {
			 return ob.get();
			 }
		return null;
		}
	}


