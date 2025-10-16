package com.demo.Test;

import java.util.Scanner;
import com.demo.beans.WrongNumberException;
public class TestGuessNumber {

	public static void main(String[] args) {
			int num = 45;
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				try {
					System.out.println("Plzzz guess the number");
					int num1 = sc.nextInt();
					if(num == num1) {
						System.out.println("Yeepe you guess the right number ");
						break;
					}else {
						if(num>num1){
							throw new WrongNumberException("OOps, you miss it!! it is smaller number");
						}else {
							throw new WrongNumberException("OOps, you miss it!! it is large number");
						
					}
					}
				}catch(WrongNumberException e) {
					System.out.println(e.getMessage());
				}
			}
		}
			
	}


