package com.myCompany.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myCompany.dao.ProjectDAO;
import com.myCompany.objects.Project;
import com.myCompany.util.MyCassandraTemplate;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;
	
	@Override
	public Project createProject(Project project) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.create(project);
	}

	@Override
	public Project getProject(int id) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.findById(id, Project.class);
	}

	@Override
	public Project updateProject(Project project) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.update(project, Project.class); 
	}

	@Override
	public void deleteProject(int id) {
		myCassandraTemplate.deleteById(id, Project.class); 

	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return myCassandraTemplate.findAll(Project.class);
	}

	@Override
	public boolean projectExists(int id) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.exists(id, Project.class);
	}

}
