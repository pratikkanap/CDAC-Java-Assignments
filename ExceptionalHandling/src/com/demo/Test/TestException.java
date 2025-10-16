package com.demo.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

		private static int divide(int x,int y) {
			return x/y;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter the number ");
				int num = sc.nextInt();
				
				System.out.println("Enter the second number");
				int num1 = sc.nextInt();
			System.out.println("At the end of Block");
			//single exception
			} catch(InputMismatchException e) {
				System.out.println("plz enter the number");
				
			}
			//Multiple Exception
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception");
			}
			
			
	}

}
