package com.capgemini.spring.mvc.model.entity;

public class Person {
	private int personId;
	private String personNmae;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String personNmae) {
		super();
		this.personId = personId;
		this.personNmae = personNmae;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonNmae() {
		return personNmae;
	}
	public void setPersonNmae(String personNmae) {
		this.personNmae = personNmae;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personNmae=" + personNmae + "]";
	}
	
	
}
