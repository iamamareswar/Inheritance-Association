package com.gqt.entites;

public class Launch 
{
	public static void main(String[]args)
	{
		Employee emp=new Employee();
		emp.setEmpId(118);
		emp.setEmpName("Charan");
		emp.setEmpAddr("Banglore");
		
		Account a=new Account();
		a.setAccNo(1218);
		a.setAccType("Savings");
		a.setAccName("Charan");
		//performing Dependency injection using setters
		emp.setAcc(a);
		System.out.println(emp);
	}
}
