package com.myCompany;

import javax.validation.constraints.NotNull;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;

public class Person {
	
	@PrimaryKey("id")
	private String id;
	
	

	@NotNull
	@Column("lastname")
	public String lastName;
	
	@NotNull
	@Column("firstname")
	public String firstName;
	
	/**
	* Default Constructor
	*/
	public Person() {
		super(); 
	}
	
	/**
	* Parameterized Constructor
	* @param id
	* @param firstname
	* @param  lastname
	*/
	public Person(String id, String firstname, String lastname ) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
