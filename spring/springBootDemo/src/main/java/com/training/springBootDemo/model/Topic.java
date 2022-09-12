package com.training.springBootDemo.model;

public class Topic {
	//create private fields
	//generate getter setter
	//generate constructor - arg/no arg
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
