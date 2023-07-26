package com.Digit.Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection_Iterator {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		Iterator iterator = al.iterator();

		for (Object object : al) {
			System.out.println("hii");
		}
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------");
		
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("----------");
		
		ListIterator li = al.listIterator(al.size());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("----------");
	}
}
