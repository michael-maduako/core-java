package com.michael;

public class Employee {

	private int empId;
	private String empName;
	private Address address; //HAS A relationship
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	} 
	
	void call() {
		System.out.println(empId +" "+empName);
		System.out.println(address.getStreet() +" "+ address.getCity() + " "+ address.getState());
		
	}
	public static void main(String []args) {
		Address a1= new Address("1126 Highfield Ct","Bethel Park","PA");
		Address a2= new Address("1113 Highfield Ct","Bethel Park","PA");

		Employee e1= new Employee(1001,"Mobusher",a1);
		Employee e2= new Employee(1002,"Sam",a2);
		e1.call();e2.call();
	}
	
}
