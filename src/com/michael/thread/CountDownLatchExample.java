package com.michael.thread;

import java.util.concurrent.CountDownLatch;



public class CountDownLatchExample {
	public static void main(String[] args) {
		CountDownLatch latch= new CountDownLatch(3);
		
		//Create 3 threads passing a CountDownLatch
		Thread t1=new Thread(new MyThread2("T1",latch));
		Thread t2=new Thread(new MyThread2("T2",latch));
		Thread t3=new Thread(new MyThread2("T3",latch));
		
		//start all 3 threads
		t1.start();
		t2.start();
		t3.start();
		
		//wait for latch count to reach zero.
		try {
			latch.await();
		}catch(InterruptedException ie) {
		}
		
		System.out.println("All threads are ready");
	}

}

class MyThread2 extends Thread{
	private final String name;
	private final CountDownLatch latch;
	
	public MyThread2(String name, CountDownLatch latch) {
		this.name=name;
		this.latch=latch;
	}
	public void run() {
		System.out.println(name + " starting");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
			//thread ready, decrement latch counter
			System.out.println(name+ " ready");
			latch.countDown();
		}
	}
	

