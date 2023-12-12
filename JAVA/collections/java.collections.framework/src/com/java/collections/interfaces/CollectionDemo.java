package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

public class CollectionDemo {
	public static void main(String[] args) {
		
		Collection<String> fruitCollection =  new ArrayList<String>();
		fruitCollection.add("banana for me");
		fruitCollection.add("Apple for us");
		fruitCollection.add("mango for everyone");
		
		System.out.println(fruitCollection);
		
		fruitCollection.remove("banana for me");
		System.out.println(fruitCollection);
		
		fruitCollection.contains("Apple for us");
		
		fruitCollection.forEach((element) -> {
			System.out.println(element);
		});
		
	
		fruitCollection.clear();
	}
}
