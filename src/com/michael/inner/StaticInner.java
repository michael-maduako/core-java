package com.michael.inner;

public class StaticInner {
	
	static int x=45;
		static class Inner{
			void call() {
				System.out.println(x);
			}
		}
		public static void main(String[] args) {
			
			StaticInner.Inner outin=new StaticInner.Inner();
			outin.call();
		
		}
}
