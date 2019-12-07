package com.string;

public class PalindromString {
	public static void main(String[] args) {
		String str="JAVAJ JAVJ";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		
		if(str.equals(rev)) {
			System.out.println("palindrom");
		}
		else if(rev.charAt(0)==rev.charAt(rev.length()-1)){
			System.out.println("The lastletter are same");
		}
	}

}
