package com.test.streams;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		numbers.stream().
		peek(n -> System.out.println("Processing: " + n))
		.map(n -> n * n).forEach(System.out::println); 											// ..
	}
}
