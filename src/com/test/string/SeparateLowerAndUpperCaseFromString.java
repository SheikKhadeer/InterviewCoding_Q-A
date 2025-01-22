package com.test.string;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateLowerAndUpperCaseFromString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();
		separate_lowerAndUpperCase_characters_from_string(input);

	}

	private static void separate_lowerAndUpperCase_characters_from_string(String input) {
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();

		for (char ch : input.toCharArray()) {
			if (ch != ' ') {
				if (Character.isLowerCase(ch))
					lowerCase.append(ch);
				else
					upperCase.append(ch);
			}
		}
		System.out.println("\nOriginal Order :");
		System.out.println("Lowercase :  " + lowerCase);
		System.out.println("Uppercase :  " + upperCase);

		// alphabetical order
		char[] lowerSorted = lowerCase.toString().toCharArray();
		char[] upperSorted = upperCase.toString().toCharArray();
		Arrays.sort(lowerSorted);
		Arrays.sort(upperSorted);
		System.out.println("\nAlphabetical Order :");
		System.out.println("Lowercase :  " + lowerCase);
		System.out.println("Uppercase :  " + upperCase);

	}

}
