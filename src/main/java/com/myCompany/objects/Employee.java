package com.myCompany.objects;
import javax.validation.constraints.NotNull;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
@Table("employee")
public class Employee {
	
	@PrimaryKey("id")
	private int id;
	
	

	@NotNull
	@Column("lastname")
	public String lastName;
	
	@NotNull
	@Column("firstname")
	public String firstName;
	
	/**
	* Default Constructor
	*/
	public Employee() {
		super(); 
	}
	
	/**
	* Parameterized Constructor
	* @param id
	* @param firstname
	* @param  lastname
	*/
	public Employee(int id, String firstname, String lastname ) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
	/* (non-Javadoc)
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
	return "Employee [id=" + id + ", first name=" + firstName + ", last name" + lastName + "]";
	}

}
