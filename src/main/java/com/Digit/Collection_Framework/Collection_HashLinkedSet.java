package com.Digit.Collection_Framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_HashLinkedSet {
public static void main(String[] args) {
	LinkedHashSet lh=new LinkedHashSet();
	
	lh.add(100);
	lh.add(100);
	lh.add(200);
	lh.add(267);
//	Iterator
	
	lh.add(47);
	lh.add(93);
	lh.add(102);
	lh.add("Basu");
//	lh.remove();
	Iterator itr = lh.iterator();
	while(itr.hasNext()==true) {
		System.out.println(itr.next());
	}
	
	System.out.println("---------");
System.out.println(lh);
}
}
