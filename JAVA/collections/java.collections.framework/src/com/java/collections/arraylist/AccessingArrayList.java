package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessingArrayList {

	public static void main(String[] args) {
		List<String> topProramming =  new ArrayList<String>();
		System.out.println("Is this a programming language: "  + topProramming.isEmpty());

	topProramming.add("C");
	topProramming.add("JAVA");
	topProramming.add("PYTHON");
	topProramming.add("JAVASCRIPT");
	topProramming.add("C++");
	
	
	System.out.println("Here are the top" + topProramming.size() + " " + "programming language in the world!!");
	
	String bestProgramming = topProramming.get(1);
	
	System.out.println("BestProgramming => " + bestProgramming);
	
	
	topProramming.set(4, ".NET");
	System.out.println(topProramming);
	}

}
