package com.gqt.entites;

public class Employee 
{
	//Instance variables
		private int empId;
		private String empName;
		
		//Has - a variable
		private Branch branch;
		
		//empty string
		String data = "";

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public void setBranch(Branch branch) {
			this.branch = branch;
		}
		
		
		public String toString() {
			
			/*for(Branch br : branch) {
				data = data + br.getbId();
				data = data + '\n';
				data = data + br.getbLoc();
				data = data + '\n';
			*/
			
			
			return "Employee details: "+'\n'+
					empId+'\n'+
					empName+'\n'+
					'\n'+
					"Branch Details: "+branch.getbId()+'\n'+ branch.getbLoc()+'\n';//+data

		}

}
