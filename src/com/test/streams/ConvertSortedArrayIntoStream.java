package com.test.streams;

import java.util.Arrays;

public class ConvertSortedArrayIntoStream {
public static void main(String[] args) {
	int arr[] = { 99, 55, 203, 99, 4, 91 };
    Arrays.parallelSort(arr);
    // Sorted the Array using parallelSort()
     
    Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
}
}
