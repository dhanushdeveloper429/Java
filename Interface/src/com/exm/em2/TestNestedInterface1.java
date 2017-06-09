package com.exm.em2;

public class TestNestedInterface1  implements Showables.Message{
public void msg(){
	System.out.println("Hello nested interface");
}
public static void main(String args[]){
	Showables.Message message = new TestNestedInterface1();
	message.msg();
}
}
