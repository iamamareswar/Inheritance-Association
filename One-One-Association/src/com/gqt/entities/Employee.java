package com.gqt.entities;
//target class
public class Employee 
{
	private int empId;
	private String empName;
	private String empAddr;
	//Has-A variable
	private Account acc;
	//performing constructor injection to injectnvalues
	public Employee(int empId, String empName, String empAddr, Account acc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
		this.acc = acc;
	}
	public void disp()
	{
		System.out.println("Employee Details:");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empAddr);
		System.out.println("Account Details:");
		System.out.println(acc.getAccNo());
		System.out.println(acc.getAccType());
		System.out.println(acc.getAccName());
	}
}
