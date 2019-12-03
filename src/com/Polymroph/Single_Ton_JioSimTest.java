package com.Polymroph;

public class Single_Ton_JioSimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Single_Ton_JioSim jio=Single_Ton_JioSim.getInstance();
		System.out.println(jio);
		Single_Ton_JioSim jio1=Single_Ton_JioSim.getInstance();
		System.out.println(jio1);
		System.out.println(jio.equals(jio1));
		
		System.out.println(Single_Ton_JioSim.getInstance());
		System.out.println(Single_Ton_JioSim.getInstance());
	}

}
