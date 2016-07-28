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
	
	private static final int width = 150;
	private static final int height = 60;
	
	private static final int window_Width = 1000;
	private static final int window_Height = 1000;
	
	private void programRectangle(){
		
		double x_coordinate = getWidth() + width;
		double y_coordinate = getHeight() + height;
		GRect rect1 = new GRect(x_coordinate,y_coordinate,width,height);
		add(rect1);
		
		double x_coordinate_for_label = getWidth() + width*1.35;
		double y_coordinate_for_label = getHeight() + height*1.5;
		
		GLabel program = new GLabel("Program", x_coordinate_for_label,y_coordinate_for_label);
		add(program);
	
	}
	
	
	private void consoleProgramLine(){
		
		double x1_coordinate = getWidth() + width+width/2;
		double y1_coordinate = getHeight() + height*2;
		double x2_coordinate = getWidth()+ width+width/2;
		double y2_coordinate = getHeight()*2 - height/2;
		GLine line1 = new GLine(x1_coordinate,y1_coordinate,x2_coordinate,y2_coordinate);
		add(line1);
	}
	
	private void consoleProgramRectangle(){
		
		double x_coordinate = getWidth() + width;
		double y_coordinate = getHeight() + height*3 - 10;
		
		GRect rect2 = new GRect(x_coordinate,y_coordinate,width,height);
		add(rect2);
		
		double x_coordinate_for_label = getWidth() + width*1.25;
		double y_coordinate_for_label = getHeight() + height*3.4;
		
		GLabel program = new GLabel("ConsoleProgram", x_coordinate_for_label,y_coordinate_for_label);
		add(program);
	}
	
	private void graphicsLine(){
		
		
		double x1_coordinate = getWidth() + width+width/2;
		double y1_coordinate = getHeight() + height*2;
		double x2_coordinate = getWidth();
		double y2_coordinate = getHeight()*2 - height/2;
		
		
		GLine line1 = new GLine(x1_coordinate,y1_coordinate,x2_coordinate,y2_coordinate);
		add(line1);
	}
	
	private void graphicsProgramRectangle(){
		
		double x_coordinate = getWidth() - width/2;
		double y_coordinate = getHeight() + height*3 - 10;
		
		GRect rect2 = new GRect(x_coordinate,y_coordinate,width,height);
		add(rect2);
		
		
		double x_coordinate_for_label = getWidth()-width/4;
		double y_coordinate_for_label = getHeight() + height*3.4;
		
		
		GLabel program = new GLabel("GraphicsProgram", x_coordinate_for_label,y_coordinate_for_label);
		add(program);
	}
	
private void dialogLine(){
		
		double x1 = getWidth()/2 ;
		double y1 = getHeight()/2;
		double x2 = getWidth()/2 + width+80;
		double y2 = getHeight()/2 + height;
		
		GLine line1 = new GLine(x1,y1,x2,y2);
		add(line1);
	}
	
	private void DialogProgramRectangle(){
		
		double x_coordinate = getWidth()/2 + width;
		double y_coordinate = getHeight()/2 + height;
		
		GRect rect2 = new GRect(x_coordinate,y_coordinate,width,height);
		add(rect2);
		
		double x_coordinate_for_label = width*2;
		double y_coordinate_for_label = height + 130;
		
		GLabel program = new GLabel("DialogProgram", x_coordinate_for_label,y_coordinate_for_label);
		add(program);
	}
	
	public void run() {
		/* You fill this in. */
		
		setSize(window_Width,window_Height);
		programRectangle();
		//consoleProgramLine();
		//consoleProgramRectangle();
		graphicsLine();
		graphicsProgramRectangle();
		//dialogLine();
		//DialogProgramRectangle();
		
	}
}