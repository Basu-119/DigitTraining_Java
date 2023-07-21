package com.Digit.Collection_Framework;

import java.util.TreeSet;

public class Collection_TreeSet {
	public static void main(String[] args) {
		Collection_PriorityQueue cp1 = new Collection_PriorityQueue();
		TreeSet ts = new TreeSet();
		ts.add(10);
//		ts.add(10);//Not allow Duplicates
		ts.add(60);
		ts.add(20);
		ts.add(75);
		ts.add(291);
		ts.add(125);
		System.out.println(ts);
	}

}
