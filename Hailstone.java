/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		
		//initialize all variables and input a no...
		int count = 0;
		int n = readInt("Enter a Number :");
		
		while(true) //loop
		{
			//this handle when n is equal to 1 then terminate the program
			if(n==1)
			{
				println("The process took " +count+ " to reach !" );
				break;
			}
			
			//this condition to handle if no. is even...
			else if(n%2==0)
			{
				print(n);
				n=n/2;
				println("is even so I take half: "+ n);
			}
			
			//no. is odd ...
			else
			{
				print(n);
				n=(n*3)+1;
				println("is odd, so I make 3n+1 :"+ n);
			}
			count++;
		}
	}
}

