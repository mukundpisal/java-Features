package com.prowings.java8Features.streamApi.collectors;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringArraySort {

	
	public static void main(String[] args) {
		String[]str = {};
		List<String>  list3 = Arrays.asList("12","15","16","ab");
		
	
		List<Integer> ls= list3.stream().filter(s->Character.isDigit((Character)s.charAt(0))).map(p->Integer.parseInt(p)).map(p->p*p).collect(Collectors.toList());
		System.out.println(ls);
	}
}
