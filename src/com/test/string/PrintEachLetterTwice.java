package com.test.string;

import java.util.Scanner;

public class PrintEachLetterTwice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();

		String doubledString = printEachLetterTwice(input);
		System.out.println(doubledString);
	}

	private static String printEachLetterTwice(String inputString) {
		StringBuilder doubled = new StringBuilder();
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (ch == ' ') {
				doubled.append(ch);
			} else {
				doubled.append(ch).append(ch);
			}
		}
		return doubled.toString();
	}

}
