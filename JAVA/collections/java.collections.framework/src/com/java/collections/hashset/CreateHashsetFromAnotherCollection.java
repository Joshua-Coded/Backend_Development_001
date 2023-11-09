package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashsetFromAnotherCollection {

	public static void main(String[] args) {
	// how to add to another hashset collection
		Set<Integer> firstFiveEvenNumber = new HashSet<Integer>();
		firstFiveEvenNumber.add(2);
		firstFiveEvenNumber.add(4);
		firstFiveEvenNumber.add(6);
		firstFiveEvenNumber.add(8);
		firstFiveEvenNumber.add(10);
	
		
		Set<Integer> tenFirstEvenNumber = new HashSet<Integer>(firstFiveEvenNumber);
		System.out.println(tenFirstEvenNumber);
		
		Set<Integer> nextFiveEvenNumbers = new HashSet<Integer>();
		nextFiveEvenNumbers.add(12);
		nextFiveEvenNumbers.add(14);
		nextFiveEvenNumbers.add(16);
		nextFiveEvenNumbers.add(18);
		nextFiveEvenNumbers.add(20);
		
		tenFirstEvenNumber.addAll(nextFiveEvenNumbers);
		
		System.out.println(tenFirstEvenNumber);
		

	}

}
