package com.gqt.entites;

public class Launch 
{
	public static void main(String[] args) {
		Project project1 = new Project();
		Project project2 = new Project();
		Project project3 = new Project();
		
		project1.setpId(11);
		project1.setpName("Vendorlink");
		project1.setpMgr("Senthil");
		
		project2.setpId(12);
		project2.setpName("Maya");
		project2.setpMgr("Ramana");
		
		project3.setpId(13);
		project3.setpName("Loves");
		project3.setpMgr("Abhishek");
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		employee1.setEmpId(23);
		employee1.setEmpName("Nandish");
		employee1.setProject(project1,project2);
		
		employee2.setEmpId(24);
		employee2.setEmpName("Shafi");
		employee2.setProject(project2,project3);
		
		employee3.setEmpId(25);
		employee3.setEmpName("Sneha");
		employee3.setProject(project1,project2,project3);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}
}
