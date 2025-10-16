package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.Dao.StdDaoImpl;
import com.demo.Dao.StudentDao;
import com.demo.beans.Student;

public class ServiceImplement implements StudentService {
	private StudentDao studdao;
	public ServiceImplement() {
		studdao = new StdDaoImpl();
	}
	
	@Override
	public boolean AddStud() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String studname = sc.next();
		System.out.println("Enter Student Id :");
		int studid = sc.nextInt();
		System.out.println("Enter Student Marks :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int avgmarks = (m1+m2)/2;
		Student s = new Student(studname, studid, m1, m2, avgmarks);
		return studdao.save(s);
	}

	@Override
	public List<Student> DisplayStudent() {
		// TODO Auto-generated method stub
		return studdao.Display();
	}

	@Override
	public Student searchById(int studid) {
		// TODO Auto-generated method stub
		return studdao.findById(studid);
	}

	@Override
	public Student searchByName(String studname) {
		// TODO Auto-generated method stub
		return studdao.findByName(studname);
	}

	@Override
	public boolean updateMarks(int studid , double m1) {
		// TODO Auto-generated method stub
		return studdao.UpdateMarks(studid, m1);
	}

	
 
}
