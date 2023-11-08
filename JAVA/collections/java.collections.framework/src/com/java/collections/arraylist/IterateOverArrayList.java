package com.java.collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateOverArrayList {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("React", "Python tutorial", "c++ class", "JAVA COURSE");
//		access using basic for loop
		for (int i = 0; i < courses.size(); i ++) {
			System.out.println(courses.get(i));
		}
		
//		enhanced for each loop
		for (String course : courses) {
			System.out.println(course);
		}
		
// for iterator  loop 
		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
			
		}
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
//			java 8 stream  + lambdas example
			courses.stream().forEach(course -> System.out.println(course));
			
//			java 8 foreach
			courses.forEach((course) -> System.out.println(course));
		}
	}

