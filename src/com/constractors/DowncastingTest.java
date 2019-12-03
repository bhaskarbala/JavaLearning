package com.constractors;

public class DowncastingTest {

	public static void main(String[] args) {
			Downcasting dc=new Sample2();
			Sample2 sa=(Sample2)dc;
			System.out.println(sa.d);
			sa.sample2();
			System.out.println(sa.a);
			sa.downCasting();

	}

}
