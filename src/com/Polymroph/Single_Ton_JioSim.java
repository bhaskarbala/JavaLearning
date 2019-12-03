package com.Polymroph;

public class Single_Ton_JioSim {
	private static int jiosim_count=0;
	private static Single_Ton_JioSim jiosim=null;
	private Single_Ton_JioSim() {
		jiosim_count++;
	}
	public static Single_Ton_JioSim getInstance() {
		if (jiosim_count<=1) {
			 jiosim=new Single_Ton_JioSim();
		}
			return jiosim;
		
	}

}
