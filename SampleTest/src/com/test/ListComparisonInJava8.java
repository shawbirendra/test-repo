package com.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListComparisonInJava8 {
	public static void test() {
		List<String> nameList1 = Stream.of("birendra", "raoushni", "bijay", "rakesh", "rahul", "radha")
				.collect(Collectors.toList());
		List<String> nameList2 = Stream.of("radha", "rani", "raoushni", "kavita").collect(Collectors.toList());

		/**
		 * will filter first matching data.
		 */
		Optional<String> optional = nameList1.stream().filter(nameList2::contains).findFirst();
		if (optional.isPresent())
			System.out.println("----match found----- : data is: "+optional.get());
		else
			System.out.println("----match not found-----");

	}

	public static void main(String[] args) {
		test();
	}
}
 