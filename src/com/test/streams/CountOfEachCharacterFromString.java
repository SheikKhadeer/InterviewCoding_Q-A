package com.test.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacterFromString {
	public static void main(String[] args) {
		String s = "JAVA IS A PROGRAMMING LANAGUAGE";

		// 1. first way
		Map<Character, Long> characterCount = s.chars().mapToObj(c -> (char) c).filter(c -> c != ' ')
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		// print the result
		characterCount.forEach((character, count) -> System.out.print(character + ":" + count+" "));
		System.out.println();

		// 2.another way

		Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
		// print the result
		map.forEach((character, count) -> System.out.print(character + ":" + count+" "));
		System.out.println();

		// 3.third way you can also try using Function.identify() instead of
		// LinkedHashMap
		Map<String, Long> mapObject = Arrays.stream(s.split("")).map(String::toLowerCase)
				.filter(c -> !c.trim().isEmpty())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		mapObject.forEach((character, count) -> System.out.print(character + ":" + count+" "));
	}

}