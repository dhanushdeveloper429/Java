package com.exm.star;

public class Triangle extends TwoDShape {
	String style;
	double show(){
		return width*height/2;//are of triangle
	}
	   double sayHi(){
	return	width *  length;/// area of rectangle
	}
	   
	   double sayH(){
		   return 3.14*r*r;
	   }
	   
	   double sayS(){
		   return 4*3.14*r*r;
	   }
	   double saySS(){
		   return a*a;
	   }
	   
	   
void sStyle(){
	System.out.println("the style of it"+style);
}

}
