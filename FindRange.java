/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		
		
		//Initialize All Variable use in program
		println("Enter the list of Integer");
		int sentinel = readInt();
		int smallest = sentinel;
		int largest = sentinel;
		int count = 0;
		
		while(true)  // loop 
		{
			//first case handle when no values has enter...
			if(smallest==0 && largest==0)
			{
				println("NO value has been enter");
				break;
			}
			
			// second case when only one value has enter
			
			else{
			if(sentinel==0 && count==1)
			{
				println("the enter values has both largest and Smallest");
				break;
			}
			
			//this to terminate program if user enter value is 0
			else if(sentinel==0)
			{
				println("Smallest:"+smallest);
				println("Largest:"+largest);
				break;
			}
			
			//check no. is smmalles
			else if(sentinel<smallest)
			{
				smallest = sentinel;
			}
			
			
			//check no. is largest
			else if(sentinel>largest) 
			{
				largest = sentinel;
			}
			
			}
			count++;
			// again input no when user enter no is 0
			sentinel = readInt();
			
				
		}
	}
}

