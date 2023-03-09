package com.prowings.java8Features.streamApi.parallalStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallalStreamExample {

	public static void main(String[] args) {
		IntStream st1 = IntStream.range(50, 100);
		st1.parallel().forEach(System.out::println);
	}
}
