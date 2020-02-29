package com.michael;

public class Calculate {
	int x = 20;//instance variable
	static int y=34;//static or class variable
	
	public void test() {
		int z=67;//local variable
		System.out.println(z);
	}
	
	
	public static void main(String[]args) {
		Calculate c1=new Calculate();
		System.out.println(c1.x);
		System.out.println(Calculate.y);
		c1.test();
		System.out.println(7.34);
		System.out.println("1"+2+3);//prints 123** (depends on first plus)
		System.out.println(2+3+"1");//prints 51
		System.out.println(2+"3"+1);//prints 231

		int x1=12;
		float f=x1;
		System.out.println(x1);
		System.out.println(f);
		float f1=23.4f;
		int x2=(int)f1; //explicit casting
		System.out.println(x2);
		int x3= 130;
		byte b=(byte)x3;
		System.out.println(b); //produces -126. Range is -126 to 127
		byte b1=12;
		byte b2=12;
		byte b3= (byte)(b1+b2); //Must typecast bytes again in order to add bytes
		System.out.println(b3);



	}
		
}
