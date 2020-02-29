package com.michael.thread;

class MultiThreading2 implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable is running...");
		
	}
	public static void main(int x) { //Method Overloading
		System.out.println(x*x);
	}
	public static void main(String[] args) {
		MultiThreading2 m2=new MultiThreading2();
		Thread t1=new Thread(m2);
		t1.start();
		main(2);
		}
	}



public class MultiThreading extends Thread {
	
	public void run() {
		System.out.println("Multithreading is running...");
	}
	
	
	public static void main(String[] args) {
		MultiThreading m1=new MultiThreading();
		m1.start();
		try {
			m1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("calling main");
	}

}
