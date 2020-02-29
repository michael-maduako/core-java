package com.michael.inner;

public class Outer {
	private int x=45;
	class Inner{
		void call() {
			System.out.println("Outer variable"+x);
		}
		
	}
	public static void main(String[] args) {
		Outer o1=new Outer();
		Outer.Inner inout=o1.new Inner();
		inout.call();
	}
	
}
