package com.prowings.java8Features.streamApi;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class collectionStream {

	
	public static void main(String[] args) {

		ArrayList<String>ar = new ArrayList<String>();

		String[] st = { "abc", "bcd","", "efr","","xyz", "pqr" };
		String sr = "This method removes the element at the specified index";
		ar.addAll(Arrays.asList(st));
		
		System.out.println(ar);
		Stream<String> stream = ar.stream();
		
//		List<String> st1=stream.filter(p->p.contains("a")).collect(Collectors.toList());
//		String str = stream.filter(s->!s.isEmpty()).collect(Collectors.joining());
//		List<String> str = stream.filter(s->!s.isEmpty()).collect(Collectors.toList());
//		List<String> str = stream.filter(s->!s.contains("a")).collect(Collectors.toList());
		Map<String, Long> result = Arrays.stream(sr.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
		//		 List<String> count = stream.sorted().collect(Collectors.toList());
		Map<String,Long>occurance = Arrays.stream(sr.split(" ")).map(String::toLowerCase).collect(Collectors.groupingBy(m->m,LinkedHashMap::new,Collectors.counting()));
//		System.out.println(st1);
//		System.out.println(count);
//		System.out.println(result);
		System.out.println(occurance);

//	Integer [] number = {12,34,65,66,23,76,87,76};
//	ArrayList<Integer> arraylist = new ArrayList<Integer>();
//	arraylist.addAll(Arrays.asList(number));
//		System.out.println(arraylist);
		
		
				
		}
}
