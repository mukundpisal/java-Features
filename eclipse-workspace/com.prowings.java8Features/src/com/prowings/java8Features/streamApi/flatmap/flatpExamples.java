package com.prowings.java8Features.streamApi.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatpExamples {

	public static void main(String[] args) {
		
		
		
		String [][] array = new String [][] {{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		List<String> str = Stream.of(array).flatMap(Stream::of).filter(p->!"d".equals(p)).collect(Collectors.toList());
		System.out.println(str);
	}
	
}
