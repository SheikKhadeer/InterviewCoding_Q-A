package com.test.integer;

import java.util.Scanner;

public class FindOddOrEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = scanner.nextInt();

		if (number % 2 == 0)
			System.out.println(number + " is even");
		else
			System.out.println(number + " is odd");

		// ternary opertaor
//		String result = number % 2 == 0 ? number+ " is even" :number + " is odd";
//		System.out.println(result);
	}

}
