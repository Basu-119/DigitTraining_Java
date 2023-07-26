package com.Digit.Collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
//		HashMap<Integer, String> hm = new HashMap<>();
//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
//		TreeMap<Integer, String> hm = new TreeMap<>();
		HashMap<Integer, String> hm = new LinkedHashMap<>();

		
		hm.put(1, "Ninja");
		hm.put(5, "KTM");
		hm.put(2, "Lembor");
		hm.put(4, "BMW");
		hm.put(3, "Audi");
		
//		HashMap<String, String> hm = new HashMap<>();
//		hm.put("one", "BMW");
//		hm.put("three", "AUDI");
//		hm.put("Two", "KTM");

		System.out.println(hm);
	}
}
