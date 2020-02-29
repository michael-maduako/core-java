package com.michael.thread;

import java.util.concurrent.*;

public class CyclicBarrierTest {
	public static void main(String[] args) throws InterruptedException,BrokenBarrierException{
		
		CyclicBarrier barrier = new CyclicBarrier(3);
		//create three threads passing a name, sleep time and cyclic barrier
		Thread t1= new Thread(new MyRunnable("T1",3000,barrier));
		Thread t2= new Thread(new MyRunnable("T2",2000,barrier));
		Thread t3= new Thread(new MyRunnable("T3",1000,barrier));
		
		//start all three barriers
		t1.start();
		t2.start();
		t3.start();
		
	}
}
class MyRunnable implements Runnable{
	private String name;
	private int sleep;
	private CyclicBarrier barrier;
	public MyRunnable(String name, int sleep, CyclicBarrier barrier) {
		super();
		this.name = name;
		this.sleep = sleep;
		this.barrier = barrier;
	}
	public void run() {
		try {
			System.out.println(name+": started");
			System.out.println(name+": 1st time sleeping "+sleep);
			Thread.sleep(sleep);
			
			//all threads need to wait for each other to get to this point
			System.out.println(name+" :1st time waiting");
			barrier.await();
			
			System.out.println(name+": 2nd time sleeping "+sleep);
			Thread.sleep(sleep);
			
			//all threads need to wait for each other to get to this point
			System.out.println(name+" :2nd time waiting");
			barrier.await();
			System.out.println(name +" :finished");
			
		}catch(Exception e) {}
	}
	
	
}