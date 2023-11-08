package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();		
//		list allows us to add duplicate elements
//		list.add("element1");
//		list.add("element2");
//		list.add("element1");
//		list.add("element2");
//		
//		System.out.println(list);
//		
////		list allows us to add null elemenet
//		list.add(null);
//		list.add(null);
//		
//		System.out.println(list);
//		
//		insertion order in list
		
		list.add("element1");
		list.add("element2");
		list.add("element4");
		list.add("element3");
		list.add("element5");
		
		System.out.println(list);
		
//		ACCESSING ELEMENTS FROM A LIST
		System.out.println(list.get(0));
	} 
}
