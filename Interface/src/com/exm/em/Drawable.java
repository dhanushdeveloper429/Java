package com.exm.em;

interface Drawable {
void draw();
default void msg(){//we can have method body in interface but we need to make it default method it is available since java8 
	System.out.println("default method since java 8");
}
}
