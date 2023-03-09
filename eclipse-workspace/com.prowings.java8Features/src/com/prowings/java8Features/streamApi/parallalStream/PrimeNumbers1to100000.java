package com.prowings.java8Features.streamApi.parallalStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers1to100000 {
	public static void main(String[] args) {

        long count = Stream.iterate(0, n -> n + 1)
                .limit(1000)
                //.parallel()   with this 23s, without this 1m 10s
                .filter(PrimeNumbers1to100000::isPrime)
                .peek(x -> System.out.format("\n%s\t", x))
                .count();

        System.out.println("\nTotal: " + count);

    }
	public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
	
}
