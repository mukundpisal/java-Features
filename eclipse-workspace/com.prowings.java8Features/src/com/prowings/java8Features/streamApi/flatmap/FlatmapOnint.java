package com.prowings.java8Features.streamApi.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatmapOnint {
	
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8};
		
		Stream<int[]> StreaArray = Stream.of(arr);
 		
		IntStream intStream = StreaArray.flatMapToInt(x->Arrays.stream(x));
		intStream.forEach(System.out::println);
//		System.out.println(intStream);
	}

}
