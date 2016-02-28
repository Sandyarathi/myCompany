package com.myCompany.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myCompany.dao.EmployeeDAO;
import com.myCompany.objects.Employee;
import com.myCompany.util.*;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.create(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.findById(id, Employee.class);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.update(employee, Employee.class); 
	}

	@Override
	public void deleteEmployee(int id) {
		myCassandraTemplate.deleteById(id, Employee.class); 

	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return myCassandraTemplate.findAll(Employee.class);
	}

	@Override
	public boolean employeeExists(int id) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.exists(id, Employee.class);
	}
}
