package com.java.collections;

public class NeedOfCollections {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int[] arArray = new int[1000];
		
// limitation of array
//		1. fixed in size
//		2. can only hold homogeneous data
//      3. 
	
//	let's create array of students
		Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();

		Object[] object = new Object[10];
		object[1] = new Student();
		object[2] = new Book();
		
//		there are no ready made API's in Array
		
	}

}

class Book {}
class Student{}