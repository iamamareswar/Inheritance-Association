package com.gqt.entites;

public class Employee {
	private int empId;
	private String empName;
	private String empAddr;
	//Has-A Variable
	private Account acc;
	//performing setter injection to inject values
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "Employee Details:"+'\n'+empId+'\n'+empName+'\n'+empAddr+'\n'+"Account Details:"+'\n'
	+acc.getAccNo()+'\n'+acc.getAccType()+'\n'+acc.getAccName();
	}
	
}
