package com.java.collections.linkedlist;

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
	}

}
