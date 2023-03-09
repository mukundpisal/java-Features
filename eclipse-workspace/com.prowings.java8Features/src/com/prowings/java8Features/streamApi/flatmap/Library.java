package com.prowings.java8Features.streamApi.flatmap;

import java.util.HashSet;
import java.util.Set;

public class Library {
	
	int id;
	String name;
	Set<String> book;
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
	public Set<String> getBook() {
		return book;
	}
	public void setBook(Set<String> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
	
	public void addBook(String book) {
		if(this.book ==null) {
			this.book = new HashSet();
		}
		this.book.add(book);
	}
	
	

}
