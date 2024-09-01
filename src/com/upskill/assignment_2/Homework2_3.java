package com.upskill.assignment_2;

public class Homework2_3 {

	private static int a;
	private static int b;
	public static void main(String[] args) {
		
		a = f1();
		b = f2();
		compare();
	}
	public static int f1() {
		return 99;
	}
	public static int f2() {
		return 101;
	}
	public static void compare() {
		if (a < b){
			
			System.out.println("Second number is bigger");
		
		} if (a > b) {
			
			System.out.println("First number is bigger");
		}
	}
	
	}
