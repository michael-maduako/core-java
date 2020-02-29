package com.michael.io;
import java.io.Serializable;

public class Employee implements Serializable{
	int empId;
	String empAddress;
	String empName;
	public Employee(int empId, Address empAddress, String empName) {
		super();
		this.empId = empId;
		//this.empAddress = empAddress;
		this.empName = empName;
	}
	
}
