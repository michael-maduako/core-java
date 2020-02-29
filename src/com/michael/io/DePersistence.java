package com.michael.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DePersistence {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:\\Users\\mboy4\\eclipse-workspace2\\Code Java\\emp.ser"));
		Employee e1=(Employee)ois.readObject();
		System.out.println(e1.empId+e1.empName+e1.empAddress);
		ois.close();
	}

}
