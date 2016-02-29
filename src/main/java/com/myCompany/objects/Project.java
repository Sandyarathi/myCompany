package com.myCompany.objects;
import javax.validation.constraints.NotNull;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
@Table("project")
public class Project {
	
	@PrimaryKey("id")
	public Integer id;
	
	@NotNull
	@Column("name")
	public String name;
	
	@Column(value = "budget")
	public Float budget;

	/*public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getBudget() {
		return budget;
	}

	public void setBudget(Float budget) {
		this.budget = budget;
	}

	/* (non-Javadoc)
	* @see java.lang.Object#toString()
	*/
	/*@Override
	public String toString() {
	return "Project [id=" + id + ", name=" + name + ", budget=" + budget + "]";
	} */
}
