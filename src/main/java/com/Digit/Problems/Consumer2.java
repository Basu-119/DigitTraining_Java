package com.Digit.Problems;

public class Consumer2 extends Thread {

	Queue2 b;

	public Consumer2(Queue2 q) {
		b = q;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		while (true) {
			b.get();

		}
	}

}
