package com.michael;

class Test2{
	
}

public class Final extends Test2 {
	void display() {
		System.out.println("calling base");
	}
	public static void main(String [] args) {
		Test2 tt=new Test2();
		Final ff= new Final();
		Test2 tt1=new Final();
		//System.out.println(tt1 instanceof ff);
	}
}
