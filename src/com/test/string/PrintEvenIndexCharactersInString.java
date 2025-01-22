package com.test.string;

import java.util.Scanner;

public class PrintEvenIndexCharactersInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();

		String evenIndexCharacters = printEvenIndexCharactersInString(input);
		System.out.println(evenIndexCharacters);
	}

	private static String printEvenIndexCharactersInString(String inputString) {
		String result = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (i % 2 == 0)
				result += inputString.charAt(i);
		}
		return result;
	}

}
