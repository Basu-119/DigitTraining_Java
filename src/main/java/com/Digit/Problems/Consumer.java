package com.Digit.Problems;

public class Consumer extends Thread{

	Queue b;
	
	public Consumer(Queue q) {
	b=q;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {

	while(true) {
b.get();
		
	}
	}
}
