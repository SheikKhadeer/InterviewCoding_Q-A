package com.test.integer;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = scanner.nextInt();

		if (isPrimeNumber(number))
			System.out.println(number + " is prime number");
		else
			System.out.println(number + " is not a prime number");

		// ternary operator
//		String result = isPrimeNumber(number) ? number+ " is prime number" :number + " is not a prime number";
//		System.out.println(result);
	}

	private static boolean isPrimeNumber(int number) {
		if (number < 1)
			return false; // not a prime number
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false; // not a prime number
		}
		return true; // prime number
	}

}
