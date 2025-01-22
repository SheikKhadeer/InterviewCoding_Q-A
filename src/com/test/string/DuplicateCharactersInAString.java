package com.test.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersInAString {
	public static void main(String[] args) {
		duplicateCharactersInAString("learn java programming");

	}

	private static void duplicateCharactersInAString(String inputString) {
		HashMap<Character, Integer> hashMap = new HashMap<>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (c != ' ') {
				hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
			}
		}

		System.out.println("duplicate charcatrers in : " + inputString);

		for (Character key : hashMap.keySet()) {
			int count = hashMap.get(key);
			if (count > 1) {
				System.out.println(key + " : " + count);
			}
		}

	}

}
