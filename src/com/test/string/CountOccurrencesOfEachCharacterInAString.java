package com.test.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountOccurrencesOfEachCharacterInAString {
	public static void main(String[] args) {
		characterCount("learn java java learn a java programming");

	}

	private static void characterCount(String inputString) {
		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String s : inputString.split(" ")) {
			if (hashMap.containsKey(s))
				hashMap.put(s, hashMap.get(s) + 1);
			else
				hashMap.put(s, 1);

		}

		System.out.println("characters Count : " + hashMap);

	}

}
