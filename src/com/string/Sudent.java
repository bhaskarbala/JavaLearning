package com.string;

public class Sudent {
	int id;
	String name;
	Sudent (int id,String name){
		this.id=id;
		this.name=name;
	}
	public boolean equlas(Object obj) {
		Sudent s=(Sudent)obj;
		return this.id==s.id;
	}
	public static void main(String[] args) {
		Sudent s=new Sudent(25,"b");
		Sudent s2=new Sudent(25,"b");
		Sudent s3=s2;
		Sudent s4=s;
		
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s.equals(s4));
	}
	
	
}
