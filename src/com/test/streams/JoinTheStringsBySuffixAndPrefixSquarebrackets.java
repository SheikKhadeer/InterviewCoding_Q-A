package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTheStringsBySuffixAndPrefixSquarebrackets {
public static void main(String[] args) {
	
//	 join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
	 List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
     
     String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
      
     System.out.println(joinedString);
}
}
