package com.gqt.entites;

public class Launch 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.setEmpId(18);
		emp1.setEmpName("sachin");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(24);
		emp2.setEmpName("dhoni");
		
		Employee emp3 = new Employee();
		emp3.setEmpId(42);
		emp3.setEmpName("zabi");
		
		Employee[] e = new Employee[3];
		e[0] = emp1;
		e[1] = emp2;
		e[2] = emp3;
		
		Department dept = new Department();
		dept.setDeptId(1234);
		dept.setDeptName("Bcci");
		dept.setDeptLoc("Dubai");
		dept.setEmployees(e);
		
		
		System.out.println(dept);
		
	}

}
