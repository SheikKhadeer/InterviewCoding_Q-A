package com.test.integer;

import java.util.Scanner;

public class CalculateSumOfDigitsOfANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = scanner.nextInt();
		int sumOfDigits = CalculateSumOfDigitsOfANumber(number);
		System.out.println("Sum of the digits of " + number + " is :  " + sumOfDigits);

	}

	private static int CalculateSumOfDigitsOfANumber(int number) {

		int sum_number = 0;
		while (number > 0) {
			int digit = number % 10;
			sum_number = sum_number + digit;
			number = number / 10;
		}
		return sum_number;
	}

}
