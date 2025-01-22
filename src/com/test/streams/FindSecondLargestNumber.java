package com.test.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		// maximum number
		int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		int maxi = listOfIntegers.stream().max(Integer::compareTo).orElseThrow();
		System.out.print(max);
		System.out.print(maxi);

		List<Integer> uniqueSortNumbers = listOfIntegers.stream().distinct().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		// secondLargestNumber
		if (uniqueSortNumbers.size() >= 2)
			System.out.println(uniqueSortNumbers.get(1));
		else
			System.out.println("there are fewer than 2 unique numbers");
		// secondLargestNumber
		if (uniqueSortNumbers.size() >= 5)
			System.out.println(uniqueSortNumbers.get(4));
		else
			System.out.println("there are fewer than 5 unique numbers");
		
		
		//Avergae
		double average=listOfIntegers.stream().mapToInt(Integer::intValue).average().orElseThrow();
		System.out.println("avergae number :"+average);
		
		//last number
		int last=listOfIntegers.get(listOfIntegers.size()-1);
		System.out.println(last);

	}
}
