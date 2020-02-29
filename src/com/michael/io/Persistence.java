package com.michael.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persistence {
	
	static FileOutputStream fos=null;
	static ObjectOutputStream oos=null;
	
	public static void main(String[] args) throws IOException {
		Address a1= new Address("Highfield","Bethel Park","PA");
		Employee e1=new Employee(100,a1,"Abdul");
		//JavaDeveloper d1= new JavaDeveloper(111, "HighField Ct", "Edson", "", endDate)
		try {
			fos=new FileOutputStream("C:\\Users\\mboy4\\eclipse-workspace2\\Code Java\\emp.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.flush();
			oos.close();
			fos.close();
			System.out.println("Program ended");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
