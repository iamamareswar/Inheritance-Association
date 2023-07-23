package com.gqt.entities;

public class Launch 
{
	public static void main(String[] args) {
		

		Project prj1 = new Project(3,"vendorlink","senthil");
		Project prj2 = new Project(7,"maya","ramana");
		Project prj3 = new Project(11,"loves","abhishek");
		
		Employee emp1 = new Employee(23,"nandish",prj1,prj2);
		Employee emp2 = new Employee(26,"shafi",prj2,prj3);
		Employee emp3 = new Employee(32,"sneha",prj1,prj2,prj3);
		
		emp1.disp();
		emp2.disp();
		emp3.disp();
	}
}
