package com.string;

public class StringNew {
// not overired the methods
	int i;
	String name;
	StringNew(int i,String name){
		this.i=i;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		StringNew s=new StringNew(22,"Bhaskar");
		String s2="java";
		String str=new String("java");
		String str2=new String("java");
		char c[]=new char[5];
		StringNew str1=new StringNew(44,"Boss");
		
		System.out.println(s.toString());// fullqulify addres
		System.out.println(str1);
		
		System.out.println(s.hashCode());//
		System.out.println(str1.hashCode());
		System.out.println(s.equals(str1));
		
	}
	
	

	
	
	
	
	
}
