package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	boolean AddStud();

	List<Student> DisplayStudent();

	Student searchById(int studid);

	Student searchByName(String studname);

	boolean updateMarks(int studid , double m1);

}
