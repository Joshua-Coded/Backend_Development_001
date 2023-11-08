package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> fruitCollection =  new ArrayList<String>();
		fruitCollection.add("banana");
		fruitCollection.add("Apple");
		fruitCollection.add("mango");
		System.out.println(fruitCollection);
		
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
		
		fruitCollection.contains("Apple");
		
		fruitCollection.forEach((element) -> {
			System.out.println(element);
		});
		
	
		
	}
}
