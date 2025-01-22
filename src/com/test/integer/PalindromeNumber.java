package com.test.integer;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = scanner.nextInt();

		if (isPalindromeNumber(number))
			System.out.println(number + " is palindrome number");
		else
			System.out.println(number + " is not a palindrome number");

		// ternary operator
//		String result = isPrimeNumber(number) ? number+ " is prime number" :number + " is not a prime number";
//		System.out.println(result);
	}

	private static boolean isPalindromeNumber(int number) {
		int original_number=number;
		int reversed_number=0;
		while(number!=0) {
			int digit=number%10;
			reversed_number=reversed_number*10+digit;
			number=number/10;
		}
			return original_number==reversed_number;
	}

}
