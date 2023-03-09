package com.prowings.java8Features.lambdaCollectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(12, "Mukund",200000);
		Employee emp2 = new Employee(20, "Pranav",493000);
		Employee emp3 = new Employee(14, "Vaibhav",345000);
		Employee emp4 = new Employee(16, "Pratik",643511);
		Employee emp5 = new Employee(10, "Akshay",845388);

		ArrayList<Employee> emp = new ArrayList();
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);

		
		System.err.println(emp);
		//Sort by Id
		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.id-o2.id;
			}
		});
		
		System.out.println(emp);
		
		
		
		//Sort by name
		
		
		Collections.sort(emp, new Comparator<Employee>() {
			
						@Override
						public int compare(Employee o1, Employee o2) {
							
							return o1.getName().compareTo(o2.getName());
						}
					});
		
		System.err.println(emp);
		
		
		
		System.out.println("USING JAVA 8 ");
		System.out.println("sort by id ");

		
		emp.sort((e1, e2)->e1.getId()-e2.getId());
		emp.forEach((employee)->System.err.println(employee));
		
		System.out.println("sort by name ");

		emp.sort((e1, e2)->e1.getName().compareTo(e2.getName()));
		emp.forEach((Employee)->System.out.println(Employee));
		
		System.err.println("sort by salary");
		
		
		Comparator<Employee> salaryComparator = (o1, o2) ->o1.getSalary()-o2.getSalary();
	
		emp.sort(salaryComparator);
		System.out.println(emp);

		System.err.println("\nsort by salary reverse ");
		emp.sort(salaryComparator.reversed());
		
		System.out.println(emp);

	}

}
