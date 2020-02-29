package com.michael.inner;

interface Vechicle{
	public void speed(int x);
}

public class Anonoymous {
	public static void main(String[] args) {
		Vechicle v1=new Vechicle() {
			
			@Override
			public void speed(int x) {
				// TODO Auto-generated method stub
				System.out.println(x*x);
			}
		};
		v1.speed(3);
	}
}
