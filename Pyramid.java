/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	/** Window Size   */
	private static final int window_Width = 1000;
	private static final int window_Height = 1000;
	
	/** Others Methods */
	private void drawPyramid(double x_coordinate, double y_coordinate){
		
		for(int row=0; row<BRICKS_IN_BASE; row++){
			
			x_coordinate = x_coordinate - BRICK_WIDTH/2;
			double x_coordinate_change_Every_Turn = x_coordinate;
			for(int column=0; column<=row; column++){
				GRect rect = new GRect(x_coordinate_change_Every_Turn,y_coordinate,BRICK_WIDTH,BRICK_HEIGHT);
				add(rect);
				x_coordinate_change_Every_Turn = x_coordinate_change_Every_Turn + BRICK_WIDTH;
			}
		y_coordinate = y_coordinate + BRICK_HEIGHT;
			
		
		}
		
	}
	
	public void run() {
		
		setSize(window_Width, window_Height);
		
		double x_coordinate = getWidth()*2 + BRICK_WIDTH + BRICK_WIDTH/2;
		double y_coordinate = getHeight()*2 + getHeight()/2 + BRICK_HEIGHT*2;
		
		drawPyramid(x_coordinate, y_coordinate);
		
	}
}

