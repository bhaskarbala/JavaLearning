package com.constractors;

public class UpcastingTest {

	public static void main(String[] args) {
		Upcasting up =new Sample();
		up.upcastingDisply();
		up.superclass();
		
		System.out.println("///////////////////////");
		Sample s=new Sample();
		s.upcastingDisply();
		s.superclass();
		s.sampleDisplay();
		

	}

}
