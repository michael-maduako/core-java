package com.michael;

public class Static {
	//instance block
	{
		System.out.println("1");

	}
	//static block
	static{
	System.out.println("2");//static block gives precedence before main block!!!!

	}
	//instance block
	{
		System.out.println("3"); 

	}
	public static void main(String [] args){
			System.out.println("4");
			new Static();//**Only run the instance blocks**
	}
}
