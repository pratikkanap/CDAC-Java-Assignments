package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.Dao.StdDaoImpl;
import com.demo.Dao.StudentDao;
import com.demo.beans.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDao sdao;
	
	public StudentServiceImpl() {
		sdao = new StdDaoImpl();
	}


	@Override
	public boolean addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id");
		int studid = sc.nextInt();
		System.out.println("Enter student marks1");
		int m1 = sc.nextInt();
		System.out.println("Enter student marks2");
		int m2 = sc.nextInt();
		System.out.println("Enter student marks3");
		int m3 = sc.nextInt();
		int avgmrks = (m1+m2+m3)/3;
		System.out.println("Enter student name");
		String sname = sc.next();
		System.out.println("Enter birth date of student");
		String bdt = sc.next();
		LocalDate ldt = LocalDate.parse(bdt,DateTimeFormatter.ofPattern(bdt="dd/MM/yyyy"));
		Student s = new Student(studid, sname, ldt,m1,m2,m3,avgmrks);
		return sdao.save(s);
	}


	@Override
	public Set<Student> displayAll() {
		// TODO Auto-generated method stub
		return sdao.displayData();
	}


	@Override
	public Student searchById(int studid) {
		// TODO Auto-generated method stub
		return sdao.findById(studid);
	}


	@Override
	public Student searchByName(String sname) {
		return sdao.findByName(sname);
	}


	

}
