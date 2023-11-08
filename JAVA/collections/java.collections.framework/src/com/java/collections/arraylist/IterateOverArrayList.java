package com.java.collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class IterateOverArrayList {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("React", "Python tutorial", "c++ class", "JAVA COURSE");
//		access using basic for loop
		for (int i = 0; i < courses.size(); i ++) {
			System.out.println(courses.get(i));
		}
		
	}

}
