package com.demo.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {
		private static int divide(int x, int y) {
			return x/y;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println("Enter a number");
				int num=sc.nextInt();
				System.out.println("Enter a number");
				int num1=sc.nextInt();
				
					int result = divide(num,num1);
					System.out.println("Division : "+result);
				
				System.out.println("At the end of outer try block");
			}catch(InputMismatchException e) {
				System.out.println("Enter number");
			}catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("Error");
				System.out.println(e.getMessage());
			} 
			finally{
				System.out.println("finally block");
			}

		}

		

	}
