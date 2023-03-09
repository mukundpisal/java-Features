package com.prowings.java8Features.streamApi.collectors;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurance {
	
	public static void main(String[] args) {
		String s = "Before JDBC, ODBC API was the database API to connect and execute the query with the database But ODBC API uses ODBC driver which is written in C language";
	String []str1 = s.split(" ");
//	List<String> list = Arrays.asList("apple", "apple", "banana",
//            "apple", "orange", "banana", "papaya");
	List<String> list =Arrays.asList(str1);
	Map<String, Long> Occurance = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	Occurance.entrySet().forEach(System.out::println);
	System.out.println(list);
	System.err.println("Word occurance---> ");
	System.out.println(Occurance);
	
	Map<String, Long> reversesorted = new LinkedHashMap();
	
	Occurance.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(e->reversesorted.put(e.getKey(), e.getValue()));
	System.out.println(reversesorted);
	
	String[]str = {};
	List<String>  list3 = Arrays.asList("12","15","16","ab");
	
	
	List<Integer> list1 = list3.stream().filter(a->Character.isDigit((Character)a.charAt(0))).map(p->Integer.parseInt(p)).map(a->a*a).collect(Collectors.toList());
	
	list1.forEach(System.out::println);
	}
}
