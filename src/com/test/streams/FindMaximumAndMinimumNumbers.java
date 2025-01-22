package com.test.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumAndMinimumNumbers {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

		System.out.println("Maximum Element : " + max);

		int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

		System.out.println("Minimum Element : " + min);

		// get three maximum numbers and three minimum numbers from the given list of
		// integers
		// 3 minimum Numbers


		System.out.print("Minimum 3 Numbers : ");

		listOfIntegers.stream().sorted().limit(3).forEach(e->System.out.print(e+" "));
		System.out.println();

		// 3 Maximum Numbers	

		System.out.print("Maximum 3 Numbers :");

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(e->System.out.print(e+" "));

	}
}
