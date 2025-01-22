package com.test.string;

import java.util.Scanner;

public class CountNumberOfWordsInAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = scanner.nextLine();

		int count=1;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch==' '&& input.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
