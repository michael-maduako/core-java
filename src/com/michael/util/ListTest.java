package com.michael.util;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List<String>list= new ArrayList<String>();
		list.add("Sam");list.add("Abdul");list.add("Chris");list.add("Chris");list.add("Abdul");
		
		//Traverse using for loop
		for(String temp:list)
			System.out.println(temp);
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//Java 8 way of outputing this (::method reference)
		list.forEach(System.out::println);
		
		
		Stack<String>stack= new Stack<>();
		stack.push("Edson");stack.push("Jack");stack.push("Michael");
		stack.pop(); //removes latest entry
		Iterator<String> itr2 =stack.iterator();
		
		while(itr2.hasNext())
			System.out.println(itr2.next());
		
		PriorityQueue<String> queue= new PriorityQueue<>();
		queue.add("ABC");queue.add("DEF");queue.add("GHI");
		System.out.println("head "+queue.element());
		System.out.println("head "+queue.peek());
		System.out.println(" Iterating");
		
		Iterator <String>itr3=queue.iterator();
		while(itr3.hasNext())
			System.out.println(itr3.next());
		queue.remove();
		queue.poll();
		boolean b= queue.contains("E");
		System.out.println("priotity queue contains E or not: "+b);
		
		System.out.println("After removing 2 elements ");
		Iterator <String>itr4=queue.iterator();

		while(itr4.hasNext())
			System.out.println(itr4.next());
		
		Object[] arr= queue.toArray();
		System.out.println("values in array");
		for(int i=0; i<arr.length;i++)
			System.out.println("Value " +arr[i].toString());
		
		
		Set<String> set=new HashSet<>();
		set.add("AAA");set.add("BBB");set.add("AAA");set.add("CCC");
		Iterator <String>itr5=set.iterator();

		while(itr5.hasNext())
			System.out.println(itr5.next());
		
		
		
		Set<String> set2=new LinkedHashSet<>();
		set2.add("AAA");set2.add("BBB");set2.add("AAA");set2.add("CCC");
		Iterator<String>itr6=set2.iterator();

		while(itr6.hasNext())
			System.out.println(itr6.next());
		//
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Tamirat");map.put(2,"Jack");map.put(3,"Mobusher");map.put(1,"Edson");
		Set set3= map.entrySet();
		Iterator itr7= set3.iterator();
		
		while(itr7.hasNext()) {
			Map.Entry entry=(Map.Entry)itr7.next();
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(System.out::println);
		
	}

}
