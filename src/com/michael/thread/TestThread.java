package com.michael.thread;

public class TestThread extends Thread{
	public void run() {
		for(int i=1; i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		TestThread t1=new TestThread();
		t1.setName("T1");
		TestThread t2=new TestThread();
		t2.setName("T2");
		TestThread t3=new TestThread();
		t3.setName("T3");

		t1.start();
		t1.join(); //gives precedence to t1 so t2 does not start until t1 finishes
		t2.start();t3.start();
		//t1.run();t2.run();
	}
}
