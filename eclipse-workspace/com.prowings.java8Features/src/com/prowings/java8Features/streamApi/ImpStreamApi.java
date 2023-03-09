package com.prowings.java8Features.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class ImpStreamApi {
	
	public static void main(String[] args) {
		
		ArrayList< Integer> list = new ArrayList<>();
		
		list.add(135);
		list.add(153);
		list.add(132);
		list.add(165);
		list.add(112);
		list.add(176);
		list.add(198);
		list.add(123);		
		System.out.println(list);
		
//		find most resent three values are added
		
		
		List<Integer> alist= list.stream().unordered().collect(Collectors.toList());
		System.out.println(alist);
		
		Collections.reverse(alist);
		System.out.println(alist);
	}

}
