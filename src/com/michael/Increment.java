package com.michael;

public class Increment {
	static int count=0; //keeps track of memory so the value is incremented
	Increment(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new Increment();
		new Increment();
		new Increment();

	}

}
