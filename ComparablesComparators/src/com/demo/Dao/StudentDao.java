package com.demo.Dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {
	
	boolean save(Student s);

	List<Student> Display();

	Student findById(int studid);

	Student findByName(String studname);

	boolean UpdateMarks(int studid , int m1);

	

}
