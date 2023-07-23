package com.gqt.entites;

public class Department 
{
	private int deptId;
	private String deptName;
	private String deptLoc;
	
	//Has-a variable
    Employee[] employees;
	
	String data = "";
	

	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}


	public void setEmployees(Employee[] employees) {
		this.employees = employees;

	}
	

	public String toString() {
		
	for(Employee emp : employees) {
		data = data + emp.getEmpId();
		data = data + '\n'+'\n';
		data = data + emp.getEmpName();
		data = data + '\n'+'\n';
	}
		
		return "Department details:"+'\n'+
				deptId+'\n'+
				deptName+'\n'+
				deptLoc+'\n'+
				'\n'+
				"Employee details: "+'\n'+'\n'+data;

	}
}
