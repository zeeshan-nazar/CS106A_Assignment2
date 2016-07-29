/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.ConsoleProgram;


public class PythagoreanTheorem extends ConsoleProgram {
	
	private void findingPythagoreanTheorem(int a, int b)
	{
		//compute the formula of theorem...
				double c = Math.sqrt((a*a)+(b*b));
				
				//output of the program...
				println("c ="+ c);
	}
	
	public void run() {
		/* You fill this in */
		//Input the numbers...
		println("Enter values to compute Pythagorean theorem");
		int a = readInt("a :");
		int b = readInt("b :");
		
		findingPythagoreanTheorem(a,b);
		
	}
}
