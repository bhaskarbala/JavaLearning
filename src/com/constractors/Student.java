package com.constractors;

public class Student {

	String name;
	int roll_Number;
	String coures;
	
	public Student(String n,int rn,String c) {
		name=n;
		roll_Number =rn;
		coures=c;
	}
	public Student(String n,int rn) {
		coures="MCA";
		name=n;
		roll_Number=rn;
	}
	public void showStudentInformation() {
		System.out.println("Showing Student infromation");
		System.out.println("Name is "+name);
		System.out.println("Roll_Number is "+roll_Number);
		System.out.println("Coures is "+coures);
	}
	

}
