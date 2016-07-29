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
	
    private void outerCircle() {
        double radius =72;
        double x_coordinate = getWidth()/2 - radius;
        double y_coordinate = getHeight()/2 - radius;
        GOval outerCircle = new GOval (x_coordinate, y_coordinate, radius*2, radius*2);
        outerCircle.setColor(Color.RED);
        outerCircle.setFilled(true);
        outerCircle.setFillColor(Color.RED);
        add(outerCircle);
    }
    private void middleCircle() {
        double radius = 72*65/100;
        double x_coordinate = getWidth()/2 - radius;
        double y_coordinate= getHeight()/2 - radius;
        GOval middleCircle = new GOval (x_coordinate, y_coordinate, radius*2, radius*2);
        middleCircle.setColor(Color.WHITE);
        middleCircle.setFilled(true);
        middleCircle.setFillColor(Color.WHITE);
        add(middleCircle);
    }
    private void innerCircle() {
        double radius = 72*30/100;
        double x_coordinate = getWidth()/2 - radius;
        double y_coordinate = getHeight()/2 -radius;
        GOval innerCircle = new GOval (x_coordinate, y_coordinate, radius*2, radius*2);
        innerCircle.setColor(Color.RED);
        innerCircle.setFilled(true);
        innerCircle.setFillColor(Color.RED);
        add(innerCircle);
    }
    
    public void run() {
    	
    	
        outerCircle();
        middleCircle();
        innerCircle();
    }
}
	

