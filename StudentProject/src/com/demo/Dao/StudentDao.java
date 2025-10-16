package com.demo.Dao;

import java.util.Set;

import com.demo.beans.Student;

public interface StudentDao {

	boolean save(Student s);

	Set<Student> displayData();

	Student findById(int studid);

	Student findByName(String sname);

}
