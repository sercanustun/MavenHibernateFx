package com.bilgiadam.boost.java.course01.lesson067.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bilgiadam.boost.java.course01.lesson067.model.Person;

@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "last_name")
	private String lastName;
	
	public PersonEntity() {
		super();
	}
	
	public PersonEntity(long id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	public PersonEntity(Person person) {
		// this.id = person.getId();
		this.name = person.getName();
		this.lastName = person.getLastName();
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
		return "PersonEntity [id=" + this.id + ", name=" + this.name + ", lastName=" + this.lastName + "]";
	}
}
