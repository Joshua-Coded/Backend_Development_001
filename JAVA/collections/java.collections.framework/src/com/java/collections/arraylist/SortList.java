/**
 * 
 */
package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 */
public class SortList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(40);
//		list.add(30);
//		list.add(20);
//		list.add(60);
//		list.add(100);
//		list.add(9);
//		
//		
//		
//		Collections.sort(list);  // sort ascending order
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		System.out.println(list);   // descending order
		
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Joshua", 10, 6000));
		employee.add(new Employee(2, "Alana", 10, 1000));
		employee.add(new Employee(3, "Victor", 10, 90000));
		employee.add(new Employee(4, "Bosede", 10, 8000));
		
//		Collections.sort(employee, new MySort()); // ASCENDING ORDER
//		Collections.sort(employee, new MySort());
//		System.out.println(employee);
	
//		Collections.sort(employee, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//			
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//		});
		
//		getting it via lambdas
		Collections.sort(employee, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		
		System.out.println(employee);
		
	}
}

//class MySort implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return (int) (o1.getSalary() - o2.getSalary());
//	}
//	
//}
