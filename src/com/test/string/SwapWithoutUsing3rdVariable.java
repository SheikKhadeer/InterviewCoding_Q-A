package com.test.string;

import java.util.Scanner;

public class SwapWithoutUsing3rdVariable {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First string : ");
		String input1 = scanner.nextLine();
		System.out.print("Enter second string : ");
		String input2 = scanner.nextLine();

		input1 = input1 + input2;
		input2 = input1.substring(0, input1.length() - input2.length());
		input1 = input1.substring(input2.length());

		System.out.println(input1 + "  " + input2);
	}

}
