package com.upskill.java_2;

public class Loops {
	
/* Types of Loops
	1. For loops - Do again and again upto upper limit
	2. While Loop - Do again and again upto condition match
	3. Do While Loop - Do action hen match condition
	4. Infinite Loop - never ending loop
*/

	public static void main(String[] args) {
	//	practiceForLoop();
	//	practiceWhileLoop();
	//	practiceDoWhileLoop();
	//	practiceInfiniteLoop();
		practiceNestedForLoop();
		
	}
	public static void practiceForLoop() {
		int i;
		for(i = 1; i <100; i++) {
			System.out.println("For Loops Number = " + i);	
		}
	}
	
	public static void practiceWhileLoop() {
		int i = 1;
		while(i<10) {
			System.out.println("While Loops Number = " + i); i++;
		}
	}
	public static void practiceDoWhileLoop() {
		int i =1;
		do {
			System.out.println("Do While Loops Number = " + i); i++;
		} while (i<=0);
	}
	public static void practiceInfiniteLoop() {
		int i;
		for (i = 1; ;i++){
			System.out.println("Infinite Loops Number = " + i);
		}
	}
	public static void practiceNestedForLoop() {
		int i;
		int j;
		for (i=1; i<=10; i++){
			for (j=1; j<=10; j++){
				int multipicationTable = i * j;
				System.out.print(multipicationTable + " ");
				
			}
			System.out.println(" ");
		}
	}
	
}