package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.enumdata.Gender;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person(11,"Aditya",Gender.female);
		Person q = new Person(12,"Pratik",Gender.male);
		System.out.println(p);
		System.out.println(q);
	}

}
