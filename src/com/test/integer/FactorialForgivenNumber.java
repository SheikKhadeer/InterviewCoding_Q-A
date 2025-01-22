package com.test.integer;

import java.util.Scanner;

public class FactorialForgivenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the factorial number :");
		int factorial_number = scanner.nextInt();
		System.out.print("Enter the Any number :");
		int number= scanner.nextInt();
		
		
		for (int i = 1; i <= number ; i++) {
			factorial_number=factorial_number*i;
		}
		System.out.println("Factorial number :"+ factorial_number);
	}

}
