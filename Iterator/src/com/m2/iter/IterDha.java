package com.m2.iter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterDha {

	public static void main(String [] args){
		List<Integer> l = new ArrayList<>();
		l.add(123);
		l.add(425);
		l.add(123);
		l.add(233);
		
		
		ListIterator<Integer> it = l.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

//iterator is method in a list interface which will give you iterator interface object
//
//it.hasnext to check the element
//
//it.next give the element that is there in  the list
//
//Iterator is to the loop to the list interface




