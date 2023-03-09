package com.prowings.java8Features.streamApi;

import java.util.ArrayList;import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	int id;
	String name;
	int salary;
	
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1001, "Mukund", 1200000);
		Employee employee2 = new Employee(1002, "Ram", 1300000);
		Employee employee3 = new Employee(1003, "Sham", 1000000);
		Employee employee4 = new Employee(1004, "Vaibhav", 800000);
		Employee employee5 = new Employee(1005, "Akshay", 1600000);
		Employee employee6 = new Employee(1006, "Pratik", 1100000);	

		
		ArrayList< Employee> arrayList = new ArrayList<>();
		
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);
		arrayList.add(employee5);
		arrayList.add(employee6);
		
		System.out.println(arrayList);
		
		double average  = arrayList.stream().mapToInt(E->E.getSalary()).average().getAsDouble();
		
		
		
		System.out.println(average);
		
		int max =  arrayList.stream().mapToInt(e->e.getSalary()).max().getAsInt();
		System.out.println(max);
		
		
		int min = arrayList.stream().mapToInt(e->e.getSalary()).min().getAsInt();
		System.out.println(min);
		
		arrayList.stream().filter(e->e.getSalary()>1000000).collect(Collectors.toList()).forEach(System.out::println);
		List<Employee> sortBySalary = arrayList.stream().sorted((e1, e2)->e1.getSalary()-e2.getSalary()).collect(Collectors.toList());
		
		System.out.println(sortBySalary);
		List<Employee> sortByName = arrayList.stream().sorted((e1, e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		
		System.out.println(sortByName);
	
				
	}
	

}