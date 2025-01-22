package com.test.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UnsortedArrayToSingleSortedArray {
	public static void main(String[] args) {
		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 3, 9, 5 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

		System.out.println(Arrays.toString(c));

		// merge two unsorted arrays into single sorted array without duplicates
		int[] d = new int[] { 4, 2, 5, 1 };

		int[] e = new int[] { 8, 1, 2, 5 };

		int[] f = IntStream.concat(Arrays.stream(d), Arrays.stream(e)).sorted().distinct().toArray();

		System.out.println(Arrays.toString(f));
	}
}
