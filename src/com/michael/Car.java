package com.michael;

public class Car {
	String sound;
	int speed;
	Car(){
		System.out.println("Car is created");	

	}
	//zero/no argument constructor
	Car(String sound,int speed){
		this.sound=sound;
		this.speed=speed;
	}
	void call() {
		System.out.println(sound +" "+speed);
	}
	
	public static void main(String[]args) {
		//default constructor
		Car c1= new Car("abc",123);
		Car c2= new Car("def",23);
		c1.sound=c2.sound;
		c2.speed=c1.speed;
		c1.call();c2.call();
	}
}
