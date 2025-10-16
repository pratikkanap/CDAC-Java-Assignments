package com.demo.enumdata;

public enum Coffee {
     small(100,150),medium(140,340),large(120,300);
	private int size;
	private double price;
	
	private Coffee(int size,double price) {
		this.size = size;
		this.price = price;
	}
	
	public int getSize() {
		return size;
	}
	
	public double getPrice() {
		return price;
	}
	
}
