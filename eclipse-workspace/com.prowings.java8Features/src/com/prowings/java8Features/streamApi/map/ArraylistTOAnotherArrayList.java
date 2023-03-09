package com.prowings.java8Features.streamApi.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraylistTOAnotherArrayList {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Mukund", 25, 22000);
		Employee emp2 = new Employee("Pranav", 26, 23000);
		Employee emp3 = new Employee("Vaibhav", 27, 29000);
		Employee emp4 = new Employee("Marish", 26, 26000);
		Employee emp5 = new Employee("Akshay", 28, 28000);

		List<Employee> emp = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

//	System.out.println(emp);
		List<Person> pers = new ArrayList<Person>();
		for (Employee e : emp) {
			
			Person per = new Person();
			per.setName(e.name);
			per.setAge(e.age);
			if("Mukund".equals(e.name)) {
				per.setCity("Pune");
			}
			
			pers.add(per);
		}
//		System.out.println(pers);

		
		
		System.err.println(" Using java8 map Feature");
		
		 List<Person> result = emp.stream().map(temp -> {
			 Person obj = new Person();
	            obj.setName(temp.getName());
	            obj.setAge(temp.getAge());
	            if ("Mukund".equals(temp.getName())) {
	                obj.setCity("Pune");
	            }
	            return obj;
	        }).collect(Collectors.toList());
		System.out.println(result);
	}
}
