package com.gqt.entities;

public class Employee 
{
	private int empId;
	private String empName;
	
	
	private Project[] projects;

	public Employee(int empId, String empName, Project... projects) {

		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}



	public Project[] getProjects() {
		return projects;
	}
	
	
	public void disp() {
		System.out.println("Employee Details: ");
		System.out.println(empId+" "+empName);
		System.out.println("Project Details: ");
		
		for(Project p: projects) {
			System.out.println(p.getpId()+" "+p.getpName()+" "+p.getpMgr());
		}
		System.out.println();
	}

}
