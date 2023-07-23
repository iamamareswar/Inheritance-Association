package com.gqt.entities;

public class Employee 
{
	//Instance variables
		private int empId;
		private String empName;
		
		//Has-a variable
		private Branch branch;

		public Employee(int empId, String empName, Branch branch) {
			this.empId = empId;
			this.empName = empName;
			this.branch = branch;
		}
		
		public void disp() {
			System.out.println("Employee Details: ");
			System.out.println(empId+" "+empName);
			System.out.println("Branch Details: ");
			System.out.println(branch.getbId()+" "+branch.getbLoc());
			System.out.println();
		}
}
