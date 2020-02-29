package com.michael;

public class Array {
	public static void main(String [] args) {
		int x[]=new int[5];
		x[0]=23;
		x[1]=33;x[2]=32;x[3]=38;x[4]=99;
		
		for(int i=0; i< x.length;i++) {
			System.out.println(x[i]);
		}
		int y[]= {1,2,3,4,5};
		for(int temp:y) //*************Enhanced for-loop only for objects 
			System.out.println(temp);
		
		int []z=new int[4];
		System.arraycopy(y, 0, z, 0, 4);//Returns the address of the array
		for(int temp:z)
			System.out.println(temp);
		
	}
}
