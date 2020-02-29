package com.michael;

public class ExceptionHandling {
	void display() {
		int x=45/0;
	}
	void call() {
		display();
	}
	void present() {
		try{
		call();
		}catch(Exception e) {System.out.println("Handled exception");}
	}
	
	public static void main(String[] args) {
		ExceptionHandling ee=new ExceptionHandling();
		ee.present();
		System.out.println("after the present method");
	}
}
