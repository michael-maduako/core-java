package com.michael;

import java.io.IOException;;
public class Throws {

		void test1() throws IOException{
			throw new IOException("connection issues");
		}
		
		void test2() throws IOException{
			test1();
		}
		void test3(){
			try {
				test2();
			}
			catch(Exception e) {System.out.println("Exception handled: "+e);}
		}
		
		public static void main(String[] args) {
			Throws t=new Throws();
			t.test3();
			System.out.println("program continues...");
		}
}
