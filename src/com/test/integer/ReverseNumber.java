package com.test.integer;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Any number :");

		int number, rev = 0, reminder;
		number = scanner.nextInt();

		while (number > 0) {
			reminder = number % 10;
			rev = rev * 10 + reminder;
			number = number / 10;
		}

		System.out.println("Reverse number :" + rev);
	}

}
