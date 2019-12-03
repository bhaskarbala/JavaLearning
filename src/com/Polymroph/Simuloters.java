package com.Polymroph;

public class Simuloters {
	public Runtime_Poly_Animal simulotersOfAnimalName(String name) {
		if(name.equalsIgnoreCase("Dog")) {
			 return new Dog();
		}
		else if(name.equalsIgnoreCase("Cat")) {
			return new Cat();
		}
		else if(name.equalsIgnoreCase("Cows")) {
			return new Cows();
		}else
	
		return null;
	}

}
