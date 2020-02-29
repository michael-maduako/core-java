package com.michael;

public class Product implements Cloneable{
	int prodId;
	String prdName;
	public Product(int prodId, String prdName) {
		super();
		this.prodId = prodId;
		this.prdName = prdName;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	public static void main(String[] args) {
		try {
			Product p1=new Product(1001,"TV");
			Product p2=(Product)p1.clone();
			System.out.println(p1.prodId+p1.prdName);
			System.out.println(p2.prodId+p2.prdName);
			
		}catch(Exception e) {}
	}
}
