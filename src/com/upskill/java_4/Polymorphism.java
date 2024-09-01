package com.upskill.java_4;

public class Polymorphism {

	public static void main(String[] args) {
		car(true);
	}
 
	public static void car(){
		System.out.println("My car is Audi !");
	}
	public void car (String color) {
		System.out.println("My car color is : " + color);
	}
	public void car (int seat) {
		System.out.println("My car has Seat : " + seat);
	}
	public static void car (boolean ev) {
		System.out.println("My car is EV : " + ev);
	}
	
}
