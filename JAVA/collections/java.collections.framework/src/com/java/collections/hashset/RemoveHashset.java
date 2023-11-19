package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class RemoveHashset {

	public static void main(String[] args) {
		// create hashset object
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		// remove a particular element from hashset using the remove()
		boolean result = numbers.remove("1");
		System.out.println(result);
	}

}
