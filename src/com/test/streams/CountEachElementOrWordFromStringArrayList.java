package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElementOrWordFromStringArrayList {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC", "BB","CC","CC","DD");
		Map<String, Long> namesCount = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("List   : "+namesCount);

		// finding duplicates from the arraylist

		Map<String, Long> namesCountList = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("Duplicates list :"+namesCountList);

	}
}