package com.string;

import java.util.Scanner;

public class SecondOccernc {
	public static void main(String[] args) {
		
	 int count =0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.nextLine();
	char ch='r';
	char [] c=str.toCharArray();
	for(int i=0;i<=c.length-1;i++) {
		if(ch==c[i]) {
			count ++;
			System.out.println(i);
		}
	}
	if(count<=4
			) {
		System.out.println(count);
	}
	
	}
}
