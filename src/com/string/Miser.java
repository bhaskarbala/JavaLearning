package com.string;

public class Miser {

	public static void main(String[] args) {
	
		String s="Listen to our weekly top songs";
		// length()
		System.out.println(s.length());
		System.out.println(s.length()-1);
		//charAt()
		System.out.println(s.charAt(s.length()-1));
		System.err.println(s.charAt(5));
		char []c=s.toCharArray();
		for(char ch:c) {
			System.out.print(ch);
		}
		System.out.println("------Revers-------");
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		System.out.println("----------------------------");
		for(int i=0;i<=c.length-1;i++) {
			System.err.print(c[i]);
		}
		System.out.println("-------------");
		// First occerance
		System.out.println(s.indexOf("s"));
		System.out.println(s.indexOf("s",2));
		System.out.println(s.indexOf("our"));
		// last occerance
		System.out.println(s.lastIndexOf("weekly"));
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s.lastIndexOf("s", 4));
		// contains
		System.out.println(s.contains("our weekly "));
		System.out.println(s.substring(10));
		System.out.println(s.substring(10, 20));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String st=s.concat(" Boss is back");
		System.out.println(st);
		System.out.println(s.equals(st));
		System.out.println(s.hashCode());
		System.out.println(st.hashCode());
		System.out.println(s);
		System.out.println(st);
		

	}

}
