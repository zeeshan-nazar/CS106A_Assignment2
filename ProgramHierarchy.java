/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		//top rectangle and lable
		GRect rect1 = new GRect(565,275,120,50);
		GLabel label1 = new GLabel("Program",600,300);
		
		//other three rectangle,labels and connected with lines 
		
		
		GLine line1 = new GLine(620,325,475,375);
		GRect rect2 = new GRect(420,375,120,50);
		GLabel label2 = new GLabel("GraphicsProgram",430,400);
		
		GLine line2 = new GLine(620,325,620,375);
		GRect rect3 = new GRect(565,375,120,50);
		GLabel label3 = new GLabel("ConsoleProgram",580,400);
		
		GLine line3 = new GLine(620,325,765,375);
		GRect rect4 = new GRect(710,375,120,50);
		GLabel label4 = new GLabel("DialogProgram",730,400);
		
		
		//showing output all of these..
		add(rect1);
		add(label1);
		add(line1);
		add(rect2);
		add(label2);
		add(line2);
		add(rect3);
		add(label3);
		add(line3);
		add(rect4);
		add(label4);
		
	}
}

