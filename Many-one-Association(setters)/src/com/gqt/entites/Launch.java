package com.gqt.entites;

public class Launch 
{
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setbId(6);
		branch.setbLoc("YLNK");
		
		Employee employee1 = new Employee();
		employee1.setEmpId(18);
		employee1.setEmpName("sachin");
		employee1.setBranch(branch);
		
		Employee employee2 = new Employee();
		employee2.setEmpId(24);
		employee2.setEmpName("virat");
		employee2.setBranch(branch);
		
		Employee employee3 = new Employee();
		employee3.setEmpId(1);
		employee3.setEmpName("Zabi");
		employee3.setBranch(branch);
	
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
