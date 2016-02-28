package com.myCompany.service;

import java.util.ArrayList;
import java.util.List;

import com.myCompany.objects.Project;

public interface ProjectService {

	/**
	* Used to Create the Project Information
	* @param project
	* @return {@link Project}
	*/
	public Project createProject(Project project);

	/**
	* Getting the Project Information using Id
	* @param id
	* @return {@link Project}
	*/
	public Project getProject(int id);

	/**
	* Used to Update the Project Information
	* @param project
	* @return {@link Project}
	*/

	public Project updateProject(Project project);

	/**
	* Deleting the Project Information using Id
	* @param id
	*/
	public void deleteProject(int id);

	/**
	* Getting the All Projects information
	* @return
	*/
	public List<Project> getAllProjects();
	/**
	 * Check if record exists
	 */
	public boolean projectExists(int id);

	} 
