package com.test.string;

import java.util.Scanner;

public class RemoveSpaceFromGivenString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();

		String withoutSpaces = removeSpace(input);
		System.out.println(withoutSpaces);
	}

	private static String removeSpace(String inputString) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) != ' ')
				result.append(inputString.charAt(i));
		}
		return result.toString();
	}

}
