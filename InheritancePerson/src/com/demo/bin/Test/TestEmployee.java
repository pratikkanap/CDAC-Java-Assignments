package com.demo.bin.Test;

import java.util.Date;
import java.util.Scanner;

import com.demo.bin.ContractEmp;
import com.demo.bin.Employee;
import com.demo.bin.Person;
import com.demo.bin.SalariedEmp;

public class TestEmployee {
		@SuppressWarnings("deprecation")
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Choice : ");
			int choice = sc.nextInt();
			
			Employee e1 = new SalariedEmp();
			Employee e2 = new SalariedEmp();
			
			Employee e3 = new ContractEmp();
			do {
			switch(choice) {
				case 1: 
						e1=new SalariedEmp("T",31,new Date(2000,04,23),"Tester","Testing Team",30000,10);
						System.out.println("net Sal= "+e1.calculateSal());
						break;
				case 2: e2 = new SalariedEmp("P",031,new Date(2002,8,02),"Front End Developer", "Development",12, 1000);
						System.out.println("net Sal= "+e2.calculateSal());
						break;
				
				case 3: e3 = new ContractEmp("K",310,new Date(2002,10,31),"Back end", "Development", 8.0, 2000.0);
						System.out.println("The charges base on hrs : "+e3.calculatehrs());
						break;
				case 4:System.out.println("Thanks for visiting....");
						break;
						
				default:
						System.out.println("Invalid Data");
						sc.close();
				}	
			
			}while(choice==4);


			
		}
}
