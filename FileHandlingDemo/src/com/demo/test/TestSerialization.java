package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class TestSerialization {
	public static void main(String[] args) {
		
		List<Employee>	list = new ArrayList<>();
		list.add(new Employee(31,"Ruturaj",14000));
		list.add(new Employee(8,"Jadeja",14000));
		list.add(new Employee(3,"Raina",10000));
		list.add(new Employee(7,"Dhoni",40000));
		
		//Write the data
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("exampledata.txt"));){
			 for(Employee e : list) {
				 oos.writeObject(e);
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//read the data
		try(ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("exampledata.txt"))){
			while(true) {
				Employee e = (Employee)ooi.readObject();
				System.out.println(e);
			}
		}catch(EOFException e) { 
			System.out.println("Reached the end....");
		}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
