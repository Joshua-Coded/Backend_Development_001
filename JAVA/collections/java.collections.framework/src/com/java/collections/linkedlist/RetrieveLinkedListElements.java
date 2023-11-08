package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkedListElements {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		// how to get first element in a linkedlist
		String firstElement = fruits.getFirst();
		System.out.println(firstElement);
		
		
		// how to get last element in a linkedlist
				String lastElement = fruits.getLast();
				System.out.println(lastElement);
				
				
	// getting element at the given postion
				String el = fruits.get(2);
				System.out.println(el);
				
	// getting all element from linkedlist
	for (String e : fruits) {
		System.out.println(e);
	}
		
	}
}
