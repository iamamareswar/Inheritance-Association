package com.gqt.test;
import com.gqt.entities.*;
public class launch 
{

	public static void main(String[] args)
	{
		Account a=new Account(1218,"Savings","Suhas");
		Employee emp=new Employee(118,"Suhas","Banglore",a);
		emp.disp();
		
	}

}
