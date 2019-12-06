package com.string;

public class SuryaNotOverried {
	int id;
	String name;
	SuryaNotOverried(int id,String name){
		this.id=id;
		this.name=name;	
	}
	public String toString() {
	return "ID="+id+",Name="+name+"";
		
	}
	public int hashcode() {
		return id;
		
	}

	
	public static void main(String[] args) {
		SuryaNotOverried s=new SuryaNotOverried(25,"Boss");
		System.out.println(s);
		System.out.println(s.hashcode());
		SuryaNotOverried s2=new SuryaNotOverried(30,"Bhaskar");
		System.out.println(s2);
		System.out.println(s2.hashcode());
		
	}

}
