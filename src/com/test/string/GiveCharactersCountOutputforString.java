package com.test.string;

import java.util.Scanner;

public class GiveCharactersCountOutputforString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();
		String output = getCharacters(input);
		System.out.println(output);
	}

	private static String getCharacters(String input) {
		StringBuilder result = new StringBuilder();

		int count = 1;
		int length = input.length();

		for (int i = 0; i < length; i++) {
			char ch = input.charAt(i);
			if (i + 1 < length && ch == input.charAt(i + 1))
				count++;
			else {
				result.append(ch).append(count);
				count = 1;
			}
		}
		return result.toString();
	}

}
