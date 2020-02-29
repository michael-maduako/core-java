package com.michael;

class InvalidAgeException extends Exception{
	InvalidAgeException (String s){
		super(s);
	}
}


public class Throw {

	static void validateAge(int age) throws InvalidAgeException{
		if(age <18)
			throw new InvalidAgeException("Not valid age");
		else
			System.out.println("Valid to get drivers license");

	}
	
	public static void main(String[] args) {
		try {
			validateAge(17);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
