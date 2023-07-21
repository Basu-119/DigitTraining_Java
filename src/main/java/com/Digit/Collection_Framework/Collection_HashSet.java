package com.Digit.Collection_Framework;

import java.util.HashSet;

public class Collection_HashSet {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(11);
	hs.add(12);
	hs.add(13);
	hs.add(14);
	hs.add(15);
	hs.add(12);
	
	hs.add("Basu");
//	hs.remove(12);
	System.out.println(hs);
}

}
