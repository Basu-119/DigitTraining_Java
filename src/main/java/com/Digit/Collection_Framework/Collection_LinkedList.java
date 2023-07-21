package com.Digit.Collection_Framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_LinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add("Basu");
		ll.add(1, "Digit");
//		System.out.println(ll);

		ArrayList a = new ArrayList();
		a.add(200);
		a.add("Go");

//		ll.addAll(a);
//		System.out.println(ll);//Add Array list into a Linked list
		
//		a.addAll(ll);
//		System.out.println(a);//Add Linked list inside a array
		
		ll.addFirst("Hii");
		ll.addLast("Bye");
		
//		System.out.println(ll.element());
//		System.out.println(ll.equals(a));
		
//		System.out.println(ll.offer("912"));
//		System.out.println(ll.offerLast(92138));
		ll.add(100);
		ll.add(100);
//		System.out.println(ll.poll());//retrieve and remove the first element
//		System.out.println(ll.pollLast());

//		System.out.println(ll.peek());//retrieve the First element
		ll.push("hii");
//		ll.push(80);//push the element
//		ll.pop();//pop the element
		ll.remove();//remove the first element
		System.out.println(ll.size());
//		a.retainAll(ll);
//		System.out.println(a);
		
		ArrayList<Integer> arr=new ArrayList<>();
//		arr.
		System.out.println(ll);

		
		
	}
}
