package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// Array store multiple data using index
		

		int age = 30;
		
		int[] ageStarLord = new int []	{25, 30, 28,};	
		
		String[] nameStarLord = new String[] { "Red", "Blue", "Green" };
		
		
		System.out.println("Student Age :" + ageStarLord[0]);
		System.out.println("Total Student : " + ageStarLord.length);
		
		System.out.println("Student Name : " + nameStarLord[1]);
		System.out.println("Total Student Name : " + nameStarLord.length); 
		
			
			//Multi-Dimentional Array
		
			int [][] ageStarLord2D = {{25, 30, 28, },
					                  {26, 29, 30, }};
			
			System.out.println("Student Age 2d : " + ageStarLord2D [0][1]);
			
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Yellow", 23);
		Student.put("Pink", 27);
		Student.put("Orange", 32);
		Student.put("White", 31);

		System.out.println("Hashmap Student Age : " + Student.get("Pink"));
		
		//Hashmap - String String Country Capital
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Texas");
		
		System.out.println("Capital City : " + Capital.get("USA"));
		
		Hashtable<String, String> Region = new Hashtable<String, String>();

		Region.put("BD", "Asia");
		Region.put("USA", "America");
		Region.put("UAE", "Middle East");
		
		System.out.println("Region : " + Region.get("UAE"));

		HashSet<String> Car = new HashSet<String>();
		
		Car.add("Audi");
		Car.add("Volkswagen");
		Car.add("Jaguar");
		
		
		System.out.println("Car : " + Car);

		
		}
		
	}
