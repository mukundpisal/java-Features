package com.prowings.java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExamples {
	
	public static void main(String[] args) {
		
		List<String> l1 = Arrays.asList("a","b","s","e","d");
		
		List<String> lStrm = l1.stream().map(p->p.toUpperCase()).collect(Collectors.toList());
		System.out.println(lStrm);
		
		
		List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> lsqr = l2.stream().map(n->n*n).collect(Collectors.toList());
		
		System.err.println(lsqr);
	}

}
