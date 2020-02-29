package com.michael;

class Emp{
	int empId;
	String empName;
	static String empAddress;
	
	public Emp(int empId,String empName) {
		super();
		this.empId= empId;
		this.empName= empName;
	}
	void display() {
		System.out.println("Emp Id"+empId+"EmpName"+empName+"EmpAddress"+empAddress);
	}
}

public class Static2 {
	public static void main(String[] args) {
		Emp e1=new Emp(1001,"Abdul");
		Emp e2=new Emp(1002,"Jack");
		Emp e3=new Emp(1003,"Edson");
		Emp.empAddress="1126 Highfield Ct BethelPark PA 15102";
		e1.display();e2.display();e3.display();
	}
}
