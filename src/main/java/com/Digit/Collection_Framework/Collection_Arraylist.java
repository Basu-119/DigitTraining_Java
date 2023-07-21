package com.Digit.Collection_Framework;

import java.util.ArrayList;

public class Collection_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		ArrayList a1=new ArrayList();

		a.add(100);//Add 100 into array
		a.add("Basu");//add heterogeneous data
		a.add(1, "Basudev");//add element in index 1
		a1.add(212);//add in another array
		int ao=0;
		a1.add("Basu");
//		a.addAll(1,a1);//add array a1 in array a
		
//		a.clear();//It will clear all the element of an array
//		a.clone();//create a clone
//		a.contains;
//		System.out.println(a.clone());
//		System.out.println(a.contains(100));//check if a particular element is present
//		System.out.println(a.containsAll(a1));//check if all the element are present

		
//		a.ensureCapacity();
//		System.out.println(a.equals(a1));//Compare two array
//		a.forEach(a1);
//		System.out.println(a.get(0));
//		System.out.println(a.getClass());
		
//		System.out.println(a.hashCode());//Print Hashcode
//		System.out.println(a.indexOf(100));//Print index of element
		
//		System.out.println(a.isEmpty());//Check Array is empty or not
		
//		System.out.println(a.lastIndexOf("Basu"));
		
//		System.out.println(a.remove(2)+"array will be "+a);//delete index element
		
//		System.out.println(a.remove("Basu")+" "+a);//Delete particular Element
		
//		System.out.println(a.removeAll(a1)+" "+a);// remove the element in array a which are present in array a1
//		System.out.println(a.removeIf(basu));
//		System.out.println(a.retainAll(a1)+" "+a);
//		System.out.println(a.set(0, "dev"));
//		a.iterator();
//		a.replaceAll();
//		System.out.println(a.replaceAll(null));
		
//		System.out.println(a.set(2, "122")+" "+a);//set the element with another element
		
//		a.toArray();//
//		System.out.println(a);
//		a.toString();
//		a.trimToSize();
		
		System.out.println(a);
		
	}

}
