package com.exm.star;

public class Shapes {
public static void main(String args[]){
	Triangle t1 = new Triangle();
	Triangle t2 = new Triangle();
	
	
	
	
	t1.showDim();
	t1.a=12;
	t1.r=4;
	t1.width=10;
	t1.length=12;
	t1.height=12;
	System.out.println("the are of traingle");
	System.out.println(t1.show());
	
System.out.println();

	System.out.println("the are of rectangle");
	System.out.println(t1.sayHi());
	t1.style="area of traingle";

	System.out.println("the are of sphere");
	System.out.println(t1.sayS());
	
System.out.println();

System.out.println("the are of square");
System.out.println(t1.saySS());

System.out.println();
	
	
}
}
