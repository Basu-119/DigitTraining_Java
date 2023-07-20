package com.Digit.Problems;

public class Queue {
int x=0;
	public void get() {
		// TODO Auto-generated method stub
System.out.println("Consumer Consume the Product"+x);		
	}

	public void put(int i) {
		// TODO Auto-generated method stub
		x=i;
System.out.println("Producer Produce the Product"+x);		
	}

}
