package com.demo;

import java.io.Serializable;

public class Person implements Serializable{

	private long id;
	
	private String name;

	
	public Person(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Getter Setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
