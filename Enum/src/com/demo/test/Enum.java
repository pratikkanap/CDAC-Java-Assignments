package com.demo.test;

import com.demo.enumdata.Coffee;

public class Enum {

	public static void main(String[] args) {
		Coffee c = Coffee.medium;
			switch(c) {
			
			case small ->{
				System.out.println("Small : "+c.getSize()+"-------"+c.getPrice());
			}
			case medium ->{
				System.out.println("Medium : "+c.getSize()+"-------"+c.getPrice());
			}
			case large ->{
				System.out.println("Large : "+c.getSize()+"-------"+c.getPrice());
			}
			}
	}

}
