package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArrayList {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Grape");
		
		
		System.out.println(fruits);
		
		fruits.remove(2);
		
		System.out.println(fruits);
		
		
		
		List<String> subFruit = new ArrayList<String>();
		subFruit.add("mama");
		subFruit.add("lano");
		
		System.out.println("BEFORE USING THE REMOVE METHOD " + subFruit);
		subFruit.removeAll(subFruit);
		System.out.println("after USING THE REMOVE METHOD " + subFruit);
		
	}

}
