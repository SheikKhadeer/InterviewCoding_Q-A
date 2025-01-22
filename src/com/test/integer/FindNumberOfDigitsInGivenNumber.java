package com.test.integer;

import java.util.Scanner;

public class FindNumberOfDigitsInGivenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0, a = 0;
		System.out.print("Enter Any number :");
		number = scanner.nextInt();

		if (number < 0) {
			number = number * -1;
			System.out.println(number);
		} else if (number == 0)
			number = 1;

		while (number > 0) {
			number = number / 10;
			a++;
		}

		System.out.println("Number Of Digits In Given Number is   :" + a);
	}
}
