package com.constractors;

public class Point {
	double cable;
	double charge;
 
	public Point() {
		System.out.println("Constructors are process...");
		cable=20;
		charge=100;
	}
	public Point(double d,double dc) {
		System.out.println("Argumented constructors are ------------");
		cable =d;
		charge=dc;
	}
	public void showPoint() {
		System.out.println("Point is  " +cable+ "And i  "+ charge);
	}
}
