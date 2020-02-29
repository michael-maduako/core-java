package com.michael;

class TT{
	void call() {
		System.out.println("calling msg");
	}
}
interface Michael{
	
}
public class Reflection {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class x=Class.forName("com.michael.TT");
		System.out.println(x.getName());
		
		Class i=int.class;
		System.out.println(i.getName());
		
		
		Class x1=Reflection.class;
		System.out.println(x1.getName());
		Class in=Class.forName("com.michael.Michael");
		System.out.println(in.isInterface());
		Class tt=Class.forName("com.michael.TT");
		TT t1=(TT)tt.newInstance();
		t1.call();
	}
}
