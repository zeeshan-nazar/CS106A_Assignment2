/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	private void checkEvenOdd(int count, int number){
		
		while(true) //loop
		{
			//this handle when n is equal to 1 then terminate the program
			if(number==1)
			{
				println("The process took " +count+ " to reach !" );
				break;
			}
			
			//this condition to handle if no. is even...
			else if(number%2==0)
			{
				print(number);
				number=number/2;
				println(" is even so I take half: "+ number);
			}
			
			// this condition to handle if no. is odd ...
			else
			{
				print(number);
				number=(number*3)+1;
				println(" is odd, so I make 3n+1: "+ number);
			}
			count++;
		}
	}
	public void run() {
		/* You fill this in */
		
		//initialize all variables and input a no...
		int count = 0;
		
		while(true){
		int number = readInt("Enter a Number :");
		if(number == 0){
			break;
		}
		else{
			checkEvenOdd(count,number);
		}
	}
		
	}
}

