package com.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StdDaoImpl implements StudentDao{

	static List<Student> slist;
	static {
		slist = new ArrayList<>();
		slist.add(new Student("Ram",31,20,19,20));
		slist.add(new Student("sham",3,10,18,20));
		slist.add(new Student("lakshman",1,15,15,20));
		slist.add(new Student("bharat",10,10,20,20));

	}
	@Override
	public boolean save(Student s) {
		slist.add(s);
		return true;
	}
	@Override
	public List<Student> Display() {
		return slist;
	}
	@Override
	public Student findById(int studid ) {
		for(Student s : slist) {
			if(s.getStudid()==studid) {
				return s;
			}
		}
		return null;
	}
	@Override
	public Student findByName(String studname) {
		for(Student s : slist) {
			if(s.getStudname().equals(studname)) {
				return s;
			}
		}
		return null;
	}
	@Override
	public boolean UpdateMarks(int studid , int m1) {
		int pos = slist.indexOf(new Student(studid));
		if(pos!=-1) {
			Student s =slist.get(pos);
			s.setM1(m1);
			return true;
		}
		return false;
	}

	

	

	
	
}
