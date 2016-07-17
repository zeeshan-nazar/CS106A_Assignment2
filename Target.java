/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		
		
		
		
		//outer circle and its colour...
		GOval oval = new GOval(600,275,72,72);
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		//inner circle and its colour...
		GOval oval1 = new GOval(613,287,46.8,46.8);
		oval1.setFilled(true);
		oval1.setFillColor(Color.WHITE);
		
		//most innner circle and its colour...
		GOval oval2 = new GOval(625,300,21.6,21.6);
		oval2.setFilled(true);
		oval2.setFillColor(Color.RED);
		
		//output of the program
		add(oval);
		add(oval1);
		add(oval2);
		
	}
}
