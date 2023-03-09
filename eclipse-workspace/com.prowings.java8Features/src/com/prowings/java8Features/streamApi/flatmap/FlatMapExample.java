package com.prowings.java8Features.streamApi.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	
	public static void main(String[] args) {
		
		Library l1 = new Library();
		
		l1.setName("Mukund");
		l1.addBook("Java 8 in Action");
        l1.addBook("Spring Boot in Action");
        l1.addBook("Effective Java (3nd Edition)");
		
        Library l2 = new Library();
        l2.setName("Pranav");
        l2.addBook("Learning Python, 5th Edition");
        l2.addBook("Effective Java (3nd Edition)");
        
        List<Library> lst = Arrays.asList(l1,l2);
        
        Set<String> st = lst.stream().
        		map(x->x.getBook()).
        		flatMap(p->p.stream()).
        		filter(x->!x.toLowerCase().
        				contains("python")).
        		collect(Collectors.toSet());
     st.forEach(System.out::println);
        System.out.println(st);
	}
}
