package com.michael;

class Test1{
	Test1 call() {return this;}
}
public class Test extends Test1 {
//co-variant return type
	
	Test call() {return this;}
	
	void msg() {
		System.out.print("calling message");
	}

	public static void main(String[] args) {
		new Test().call();
	}
}
