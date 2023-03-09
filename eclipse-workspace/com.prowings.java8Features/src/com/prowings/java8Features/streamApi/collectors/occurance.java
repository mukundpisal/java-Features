package com.prowings.java8Features.streamApi.collectors;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurance {

	public static void main(String[] args) {
		String s = "Before JDBC, ODBC API was the database API to connect and execute the query with the database But ODBC API uses ODBC driver which is written in C language";
		String[] str1 = s.split(" ");
		List<String> list = Arrays.asList(str1);

		Map<String, Long> Occurance = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Occurance.entrySet();

//	System.out.println(list);
	System.err.println("\nWord occurance---> ");
	System.out.println(Occurance);

//	Map<String, Long> reversesorted = new LinkedHashMap();
//	
//	Occurance.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(e->reversesorted.put(e.getKey(), e.getValue()));
//	System.out.println(reversesorted);

	}
}
