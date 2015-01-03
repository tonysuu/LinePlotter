//Tony Su
//Sept.12.2013

import hsa.*;

public class LinePlotter {
    public static void main(String [] args) {
	Console c = new Console();
	
	//x-axis labels
	c.println();
	c.println();
	c.println("         y");
	c.println();
	for (int i = 8; i > 0; i--) {
	    c.println("         " + i + "\n");
	}
	
	c.println();
	//x-axis and y-axis
	c.drawLine (100, 410, 510, 410);
	c.drawLine (100, 410, 100, 80);

	//x-axis intervals
	c.drawLine (140, 410, 140, 405);
	c.drawLine (180, 410, 180, 405);
	c.drawLine (220, 410, 220, 405);
	c.drawLine (260, 410, 260, 405);
	c.drawLine (300, 410, 300, 405);
	c.drawLine (340, 410, 340, 405);
	c.drawLine (380, 410, 380, 405);
	c.drawLine (420, 410, 420, 405);
	c.drawLine (460, 410, 460, 405);
	c.drawLine (500, 410, 500, 405);

	//y-axis intervals
	c.drawLine (100, 370, 105, 370);
	c.drawLine (100, 330, 105, 330);
	c.drawLine (100, 290, 105, 290);
	c.drawLine (100, 250, 105, 250);
	c.drawLine (100, 210, 105, 210);
	c.drawLine (100, 170, 105, 170);
	c.drawLine (100, 130, 105, 130);
	c.drawLine (100, 90, 105, 90);
	
	//x-axis labels
	c.println ("            0    1    2    3    4    5    6    7    8    9    10    x");
	
	Console d = new Console();
	d.print("Enter the first x coordinate: ");
	double x1 = d.readDouble();
	d.print("Enter the first y coordinate: ");
	double y1 = d.readDouble();
	d.print("Enter the second x coordinate: ");
	double x2 = d.readDouble();
	d.print("Enter the second y coordinate: ");
	double y2 = d.readDouble();
	
	double slope = ((y2-y1)/(x2-x1));
	double midpointx = ((x1+x2)/2);
	double midpointy = ((y1+y2)/2);
	double distance = (Math.sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)))));
	
	d.println(slope);
	d.println(midpointx + ", " + midpointy);
	d.println(distance);
	
	double x3 = x1*40+100;
	double y3 = y1*-40+410;
	double x4 = x2*40+100;
	double y4 = y2*-40+410;
	c.drawLine((int)x3,(int)y3,(int)x4,(int)y4);
	
	c.println();
	
	c.println("The slope is : " + slope);
	c.println("The midpoint is at : " + midpointx + ", " + midpointy);
	c.println("The distance is : " + distance);
    
    }
}
