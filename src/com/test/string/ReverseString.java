package com.test.string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();

		char ch;
		String str = "";

		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			str = ch + str;
		}
		System.out.println("Reversed String is  :" + str);


	}

}
