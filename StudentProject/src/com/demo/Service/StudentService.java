package com.demo.Service;

import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

	boolean addNewStudent();

	Set<Student> displayAll();

	Student searchById(int studid);

	Student searchByName(String sname);



	

}
