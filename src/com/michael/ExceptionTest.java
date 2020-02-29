package com.michael;

public class ExceptionTest {
	public static void main(String[] args) {
	try { //tests line by line and throws the first exception caught only
		int x=45/1;
		int x1[]=new int[2];
		x1[3]=45;
		System.out.println(x+""+x1);
	}catch(Exception e) {System.out.println(e);}
	finally {System.out.println("finally block is called");}
	System.out.println("code follows");
}
		
}
