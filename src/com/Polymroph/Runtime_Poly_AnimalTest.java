package com.Polymroph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runtime_Poly_AnimalTest {

	public static void main(String[] args) {
		System.out.println("Enter the animal name");
		Scanner scan=new Scanner(System.in);
		String animalname=scan.nextLine();
			Simuloters s=new Simuloters();
			Runtime_Poly_Animal rpa=s.simulotersOfAnimalName(animalname);
			rpa.feedOfAnimal();
	}
 
}
