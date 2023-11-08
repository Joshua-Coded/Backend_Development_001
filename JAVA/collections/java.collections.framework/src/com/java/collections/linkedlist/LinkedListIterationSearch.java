package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterationSearch {

	public static void main(String[] args) {
		LinkedList<String> prog = new LinkedList<String>();
		prog.add("C++");
		prog.add("C");
		prog.add("core java");
		prog.add("java ee");
		prog.add("spring framework");
		prog.add("hibernate framework");
		
		boolean result = prog.contains("C");
		System.out.println(result);
		
		// find the index of the first  occurrence of an element in the linkedlist
		int index  = prog.indexOf("core java");
		System.out.println("index => " + index);
		
		// find the index of the last occurence
		int lastIndex = prog.lastIndexOf("hibernate framework");
		System.out.println("last index occurence => " + lastIndex);
		
		
//		ITERATOR
		Iterator<String> iterator =  prog.iterator();
		while (iterator.hasNext()) {
			String progg = (String) iterator.next();
			System.out.println(progg);
		}
	
		//for each to iterate linkedlist
		prog.forEach((el) -> {
			System.out.println(el);
		});
		
		// for each advanced loop
		for (String ele : prog) {
			System.out.println(ele);
		}
		
		
		
	}
}
