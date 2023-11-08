/**
 * 
 */
package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class SortList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(60);
		list.add(100);
		list.add(9);
		
		
		
		Collections.sort(list);  // sort ascending order
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);   // descending order
		
	}

}
