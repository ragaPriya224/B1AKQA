package com.training.jpaDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//topic instance to a row in a table
// row instance to a topic instance 
@Entity
public class Topic {
	//create private fields
	//generate getter setter
	//generate constructor - arg/no arg
	
	//id column 
	@Id
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic() {
		
	}
	public Topic(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
