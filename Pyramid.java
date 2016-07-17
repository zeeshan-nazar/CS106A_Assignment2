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
	
	public void run() {
		/* You fill this in. */
		
		/*int x=515;
		int y=50;
		double height=50;
		int k;
		
		for(int i=0;i<BRICKS_IN_BASE;i++)
		{
			x=x-15;
			for(int j=i+1;j<i+2;j++)
			{
				if(j==1)
				{
					GRect rect = new GRect(x+getWidth()/2,height+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
					add(rect);
				}
				else if(j>1)
				{
					k=j;
					while(k>0)
					{
						y=x;
						GRect rect = new GRect(x+getWidth()/2,50+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
						add(rect);
						y=y+30;
						
					}
				}
			}
			height=height+13.3;
		}*/
		
		//do number triqa se kiya hai :P logical triqe se tu ho ni raha :(
		
		GRect rect = new GRect(500+getWidth()/2,50+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect);
		
		GRect rect1 = new GRect(485+getWidth()/2,63.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect1);
		GRect rect2 = new GRect(515+getWidth()/2,63.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect2);
		
		GRect rect3 = new GRect(470+getWidth()/2,76.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect3);
		GRect rect4 = new GRect(500+getWidth()/2,76.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect4);
		GRect rect5 = new GRect(530+getWidth()/2,76.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect5);
		
		GRect rect6 = new GRect(455+getWidth()/2,89.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect6);
		GRect rect7 = new GRect(485+getWidth()/2,89.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect7);
		GRect rect8 = new GRect(515+getWidth()/2,89.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect8);
		GRect rect9 = new GRect(545+getWidth()/2,89.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect9);
		
		GRect rect10 = new GRect(440+getWidth()/2,102.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect10);
		GRect rect11 = new GRect(470+getWidth()/2,102.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect11);
		GRect rect12 = new GRect(500+getWidth()/2,102.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect12);
		GRect rect13 = new GRect(530+getWidth()/2,102.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect13);
		GRect rect14 = new GRect(560+getWidth()/2,102.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect14);
		
		GRect rect15 = new GRect(425+getWidth()/2,115.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect15);
		GRect rect16 = new GRect(455+getWidth()/2,115.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect16);
		GRect rect17 = new GRect(485+getWidth()/2,115.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect17);
		GRect rect18 = new GRect(515+getWidth()/2,115.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect18);
		GRect rect19 = new GRect(545+getWidth()/2,115.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect19);
		GRect rect20 = new GRect(575+getWidth()/2,115.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect20);
		
		GRect rect21 = new GRect(410+getWidth()/2,128.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect21);
		GRect rect22 = new GRect(440+getWidth()/2,128.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect22);
		GRect rect23 = new GRect(470+getWidth()/2,128.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect23);
		GRect rect24 = new GRect(500+getWidth()/2,128.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect24);
		GRect rect25 = new GRect(530+getWidth()/2,128.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect25);
		GRect rect26 = new GRect(560+getWidth()/2,128.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect26);
		GRect rect27 = new GRect(590+getWidth()/2,128.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect27);
		
		GRect rect28 = new GRect(395+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect28);
		GRect rect29 = new GRect(425+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect29);
		GRect rect30 = new GRect(455+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect30);
		GRect rect31 = new GRect(485+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect31);
		GRect rect32 = new GRect(515+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect32);
		GRect rect33 = new GRect(545+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect33);
		GRect rect34 = new GRect(575+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect34);
		GRect rect35 = new GRect(605+getWidth()/2,141.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect35);
		
		GRect rect36 = new GRect(380+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect36);
		GRect rect37 = new GRect(410+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect37);
		GRect rect38 = new GRect(440+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect38);
		GRect rect39 = new GRect(470+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect39);
		GRect rect40 = new GRect(500+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect40);
		GRect rect41 = new GRect(530+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect41);
		GRect rect42 = new GRect(560+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect42);
		GRect rect43 = new GRect(590+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect43);
		GRect rect44 = new GRect(620+getWidth()/2,154.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect44);
		
		GRect rect45 = new GRect(365+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect45);
		GRect rect46 = new GRect(395+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect46);
		GRect rect47 = new GRect(425+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect47);
		GRect rect48 = new GRect(455+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect48);
		GRect rect49 = new GRect(485+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect49);
		GRect rect50 = new GRect(515+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect50);
		GRect rect51 = new GRect(545+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect51);
		GRect rect52 = new GRect(575+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect52);
		GRect rect53 = new GRect(605+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect53);
		GRect rect54 = new GRect(635+getWidth()/2,167.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect54);
		
		GRect rect55 = new GRect(350+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect55);
		GRect rect56 = new GRect(380+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect56);
		GRect rect57 = new GRect(410+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect57);
		GRect rect58 = new GRect(440+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect58);
		GRect rect59 = new GRect(470+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect59);
		GRect rect60 = new GRect(500+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect60);
		GRect rect61 = new GRect(530+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect61);
		GRect rect62 = new GRect(560+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect62);
		GRect rect63 = new GRect(590+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect63);
		GRect rect64 = new GRect(620+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect64);
		GRect rect65 = new GRect(650+getWidth()/2,180.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect65);
		
		GRect rect66 = new GRect(335+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect66);
		GRect rect67 = new GRect(365+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect67);
		GRect rect68 = new GRect(395+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect68);
		GRect rect69 = new GRect(425+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect69);
		GRect rect70 = new GRect(455+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect70);
		GRect rect71 = new GRect(485+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect71);
		GRect rect72 = new GRect(515+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect72);
		GRect rect73 = new GRect(545+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect73);
		GRect rect74 = new GRect(575+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect74);
		GRect rect75 = new GRect(605+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect75);
		GRect rect76 = new GRect(635+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect76);
		GRect rect77 = new GRect(665+getWidth()/2,193.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect77);
		
		GRect rect78 = new GRect(320+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect78);
		GRect rect79 = new GRect(350+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect79);
		GRect rect80 = new GRect(380+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect80);
		GRect rect81 = new GRect(410+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect81);
		GRect rect82 = new GRect(440+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect82);
		GRect rect83 = new GRect(470+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect83);
		GRect rect84 = new GRect(500+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect84);
		GRect rect85 = new GRect(530+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect85);
		GRect rect86 = new GRect(560+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect86);
		GRect rect87 = new GRect(590+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect87);
		GRect rect88 = new GRect(620+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect88);
		GRect rect89 = new GRect(650+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect89);
		GRect rect90 = new GRect(680+getWidth()/2,206.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect90);
		
		GRect rect91 = new GRect(305+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect91);
		GRect rect92 = new GRect(335+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect92);
		GRect rect93 = new GRect(365+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect93);
		GRect rect94 = new GRect(395+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect94);
		GRect rect95 = new GRect(425+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect95);
		GRect rect96 = new GRect(455+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect96);
		GRect rect97 = new GRect(485+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect97);
		GRect rect98 = new GRect(515+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect98);
		GRect rect99 = new GRect(545+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect99);
		GRect rect100 = new GRect(575+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect100);
		GRect rect101 = new GRect(605+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect101);
		GRect rect102 = new GRect(635+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect102);
		GRect rect103 = new GRect(665+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect103);
		GRect rect104 = new GRect(695+getWidth()/2,219.3+getHeight()/2,BRICK_WIDTH,BRICK_HEIGHT);
		add(rect104);

		 
	}
}

