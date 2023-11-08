package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromAnotherCollection {

	public static void main(String[] args) {

		List<Integer>  firstFivePrimeNumber = new ArrayList<Integer>();
		firstFivePrimeNumber.add(2);
		firstFivePrimeNumber.add(3);
		firstFivePrimeNumber.add(5);
		firstFivePrimeNumber.add(7);
		firstFivePrimeNumber.add(11);
		
		
		List<Integer> firstTenPrimeNumber = new ArrayList<Integer>(firstFivePrimeNumber);
		
		List<Integer> nextFivePrimeNumber = new ArrayList<Integer>();
		nextFivePrimeNumber.add(13);
		nextFivePrimeNumber.add(17);
		nextFivePrimeNumber.add(19);
		nextFivePrimeNumber.add(23);
		nextFivePrimeNumber.add(29);
		
		firstTenPrimeNumber.addAll(nextFivePrimeNumber);
		System.out.println(firstTenPrimeNumber);
		
	}

}
