package com.michael.inner;

public class LocalInner {

		//Local Inner Class
		private int x=23;
		void call() {
			class Local{
				void test() {System.out.println(x);}
			}
			Local i1=new Local();
			i1.test();
		}
		public static void main(String[] args) {
			LocalInner l1=new LocalInner();
			l1.call();
		}
}
