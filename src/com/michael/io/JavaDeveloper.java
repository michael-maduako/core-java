//package com.michael.io;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//public class JavaDeveloper extends Employee {
//	String startDate;
//	String endDate;
//	public JavaDeveloper(int empId, String empAddress, String empName, String startDate, String endDate) {
//		super(empId, empAddress, empName);
//		this.startDate = startDate;
//		this.endDate = endDate;
//	}
//	
//	public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\mboy4\\eclipse-workspace2\\Code Java\\emp.ser"));
//		Employee e1=(Employee)ois.readObject();
//		JavaDeveloper j1= (JavaDeveloper)ois.readObject();
//		
//	}
//}
