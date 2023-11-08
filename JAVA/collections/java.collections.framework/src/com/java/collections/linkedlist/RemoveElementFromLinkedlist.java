package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RemoveElementFromLinkedlist {
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
	// how to remove first element from linkedlist
		String el = fruits.removeFirst();
		System.out.println(el);
		
		// remove last element in a linkedlist
		String ls = fruits.removeLast();
		System.out.println(ls);
		
	}
}
