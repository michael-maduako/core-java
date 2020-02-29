package com.michael;

 class User {
	int bonus=2000;
	public int salaryAppraisal(int a) {
		 return a*8;
	 }
 }
 
 class TechLead extends User{
	 int bonus=4000;
	 public int salaryAppraisal(int a) {
		System.out.println(a*10);
		 return a*10;
	 }
 }
 //IS A relationship
public class Developer extends User{
	String name="Jack";

		
	public static void main(String[] args) {
		User uu=new User();	
		Developer d1=new Developer();
		TechLead t1=new TechLead();
		System.out.println("Developer bonus "+ d1.bonus);
		System.out.println("Name of the developer is " + d1.name);
		
		//An example of run-time polymorphism (overridding)
		User u2= new Developer();
		User u1= new TechLead();
		
		System.out.println(u1.bonus); //this prints 2000
		u1.salaryAppraisal(2000);

		
		
	}

}
