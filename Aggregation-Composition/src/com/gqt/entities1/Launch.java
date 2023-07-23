package com.gqt.entities1;

public class Launch 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Charger charger = new Charger("samsung",25.f);
		
		Mobile mobile = new Mobile();
		mobile.setCharger(charger);
		
		/*
		System.out.println(mobile.operatingsystem.getName());
		System.out.println(mobile.operatingsystem.getSize());
		System.out.println(mobile.charger.getBrand());
		System.out.println(mobile.charger.getVoltage());
		*/
		
		mobile = null; //memory will loss
		
		System.out.println(charger.getBrand());
		System.out.println(charger.getVoltage());
		
	}

}
