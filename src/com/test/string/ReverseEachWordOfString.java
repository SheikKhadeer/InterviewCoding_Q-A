package com.test.string;

public class ReverseEachWordOfString {
	public static void main(String[] args) {
		reverseEachWordOfString("java is a good");

	}

	private static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");
		String revString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String str = "";
			char ch;
			for (int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				str = ch + str;
			}
			revString = revString + str + " ";
		}
		System.out.println("Reversed String is  :" + revString);

	}

}
