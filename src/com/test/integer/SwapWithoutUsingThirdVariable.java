package com.test.integer;

import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the First number :");
		int number1 = scanner.nextInt();
		System.out.print("Enter the Second number :");

		int number2 = scanner.nextInt();
		System.out.println("Before Swapping : values are number1: " + number1 + ",number2 =" + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After Swapping : values are number1: " + number1 + ",number2 =" + number2);

	}

}
