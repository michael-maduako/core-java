package com.michael;
import java.util.*;


interface Costco{
	 double discount();
}

abstract class Target implements Costco{
	public abstract void print();
	public abstract double discount();
}


public class Store extends Target{

	public double discount() {
		double discount=0;
		Store a=new Store();
		
		if(a instanceof Target)
			discount=0.25;
		else if(a instanceof Costco)
			discount=0.1;
		return discount;
	}

	public void print() {
		double discount=this.discount();
		System.out.println("Your discount is: "+discount);
	}
	
	//double discount;

	public static void main(String[] args) {
		//double total=37.99;
		Scanner reader= new Scanner(System.in);
		System.out.println("Hello! Which store are you in?: ");
		String ans= reader.nextLine();
		
		System.out.println("Please enter your total amt: ");
		double total= reader.nextDouble();
		
		Target emp1= new Store();
		
		//Store emp2=new Target();
		//double discount2=emp2.discount();
		emp1.print();
		//System.out.println(discount1);
		//System.out.println(discount2);
	}

	

}
