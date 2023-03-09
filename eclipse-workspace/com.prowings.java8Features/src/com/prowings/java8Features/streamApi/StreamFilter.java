package com.prowings.java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ram", "Sham", "Vaibhav", "Ram");

		List<String> lists = list.stream().filter(list1 -> !"Ram".equals(list1)).collect(Collectors.toList());

//		lists.forEach(System.out::println); // output : spring, node
		
		
		
		
		person person1= new person("Ram", 12345);
		person person2= new person("Sham", 12346);
		person person3= new person("Pranav", 12345);
		person person4= new person("VAibhav", 15345);
		person person5= new person("Mukund", 12545);
		
		
		List<person> list2 = Arrays.asList(person1,person2,person3,person4,person5);
		
		person list3= list2.stream().filter(per->"Mukund".equals(per.getName())).findAny().orElse(null);
		
		
//		System.out.println(list3);
		
		
	//multiple condotions using find
		
		
		
		person p1 = list2.stream().filter(pers->"Mukund".equals(pers.getName())&&  12345<pers.getNo()).findAny().orElse(null);
		
//		System.out.println(p1);
		
		
		String name = list2.stream().filter(pers->"mukund".equalsIgnoreCase(pers.getName())).map(person::getName).findAny().orElse(null);
		
//		System.out.println("Name : "+name );
		
		List<String> names = list2.stream().map(person::getName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}


class person{
	String name;
	int no;
	public person(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", no=" + no + "]";
	}
	
	
}