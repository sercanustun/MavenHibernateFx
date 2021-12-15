package com.bilgiadam.boost.java.course01.lesson067.model;

public class Person {
	private long id;
	private String name;
	private String lastName;
	
	public Person(long id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + this.id + ", name=" + this.name + ", lastName=" + this.lastName + "]";
	}
}
