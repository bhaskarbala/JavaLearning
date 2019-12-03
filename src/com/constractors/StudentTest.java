package com.constractors;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stud;
		stud=new Student("Bhaskar",1,"MAB");
		Student st=new Student("Balue",143);
		stud.showStudentInformation();
		System.out.println("-----------------------");
		st.showStudentInformation();
	}

}
