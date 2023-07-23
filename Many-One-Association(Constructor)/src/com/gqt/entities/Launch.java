package com.gqt.entities;

public class Launch 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Branch branch = new Branch(18,"YLNK");
		
		Employee employee1 = new Employee(18,"sachin",branch);
		Employee employee2 = new Employee(24,"virat",branch);
		Employee employee3 = new Employee(1,"Zabi",branch);
		
		employee1.disp();
		employee2.disp();
		employee3.disp();
		
	}
}
