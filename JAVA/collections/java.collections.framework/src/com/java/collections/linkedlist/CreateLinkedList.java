package com.java.collections.linkedlist;

import java.util.LinkedList;

public class CreateLinkedList {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		
		System.out.println(fruits);
		
		
		// adding elements to a specific position in linkedlist
		
		fruits.add(2, "Watermelon");
		fruits.add(3, "Pawpaw");
		
		System.out.println("Adding elements to a specific postion => " + fruits);
		
		
		// adding elements at the beginning of linkedlist
		fruits.addFirst("STRAWBERRY");
		System.out.println("Adding at the first position +" + fruits);
		
		// adding at the end of linkedlist 
		fruits.addLast("Orange");
		System.out.println("Adding at the last position +" + fruits);
	}
}
