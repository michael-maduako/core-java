package com.michael.thread;

class Callme{
	synchronized void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Caller implements Runnable{
	Callme target;
	String msg;
	Thread t;
	Caller(Callme target,String msg) {
		this.target=target;
		this.msg=msg;
		t=new Thread(this);
		t.start();
	}
	
	public void run() {
		synchronized (target) {
			target.call(msg);
		}
	}
		
}

public class Synch {
	public static void main(String[] args) {
		Callme c1=new Callme();
		Caller c2=new Caller(c1,"Multi");
		Caller c3=new Caller(c1,"Thread");
		Caller c4=new Caller(c1,"Programming");

	}
}
