package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSet {
	public static void main(String[] args) {
	
		// create hashset using HashSet() constructor
		
		Set<String> programming = new HashSet<String>();
		programming.add("C");
		programming.add("C++");
		programming.add("Java");
		programming.add("python");
		programming.add("Django");
		programming.add("Scala");
				
		
		System.out.println(programming);
	
	}
}
