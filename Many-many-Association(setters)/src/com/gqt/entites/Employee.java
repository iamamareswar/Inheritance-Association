package com.gqt.entites;

public class Employee 
{
	private int empId;
	private String empName;
	
	private Project[] project;
	
	String data = "";
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setProject(Project... project) {
		this.project = project;
	}
	public String toString() {
		
		for(Project project : project) {
			data = data+project.getpId();
			data = data+'\n';
			data = data+project.getpName();
			data = data+'\n';
			data = data+project.getpMgr()+'\n';
			
		}
		System.out.println();
		
		return "Employee Details: "+'\n'+
				empId+'\n'+
				empName+'\n'+
				"Project Details: "+'\n'+data;
				
				
	}
	
}
