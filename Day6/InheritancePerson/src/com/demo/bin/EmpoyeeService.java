package com.demo.bin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmpoyeeService {

		static Employee[] empArr;
		
		static int count;
		
		static {
			empArr = new Employee[100];
			empArr[0] = new SalariedEmp("Aditya",30,new Date(2002,12,20),"Developer","Software",30000,10);
			empArr[1] = new SalariedEmp("pratik",30,new Date(2002,11,2),"Developer","Software",31000,10);
			empArr[2] = new SalariedEmp("arya",30,new Date(2011,10,5),"Developer","Software",32000,10);
			empArr[3] = new SalariedEmp("kedar",30,new Date(2011,11,20),"Developer","Software",33000,10);
			empArr[4] = new SalariedEmp("krishna",30,new Date(2003,12,25),"Developer","Software",34000,10);
			count = 5;
		}
		
		public static boolean addNewEmp(int ch) {
			Scanner sc = new Scanner(System.in);
			   if(count<empArr.length) {
				    System.out.println("Enter name");
				    String pname=sc.next();
				    System.out.println("enter birth date(dd/MM/yyyy)");
				    System.out.println("enter birth date(dd/MM/yyyy)");
				    String bdate = sc.next(); // get input as String
				    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				    Date bdate = sdf.parse(bdate);
				    
				    System.out.println("enter department");
				    String dpt=sc.next();
				    System.out.println("enter designation");
				    String dgn=sc.next();
				    if(ch==1) {
				    	System.out.println("enetr salary");
				    	double sal=sc.nextDouble();
				    	empArr[count]=new SalariedEmp(pname,ch, bdate1,dpt,dgn,sal, 0);
				    	count++;
				    }else if(ch==2) {
				    	System.out.println("enetr hrs");
				    	float hrs=sc.nextFloat();
				    	System.out.println("enetr charges");
				    	double charges=sc.nextDouble();
				    	empArr[count]=new ContractEmp(pname,ch, bdate1,dpt,dgn,hrs,charges);
				    	count++;
				    	
				    }else {
				    	
				    	//accept details of vendor
				    }
				    return true;
			    }
			    return false;
			   }	

}
