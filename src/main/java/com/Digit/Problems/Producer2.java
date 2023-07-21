package com.Digit.Problems;

public class Producer2 extends Thread{
	Queue2 a;

	public Producer2(Queue2 q) {
		a = q;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			a.put(i++);
		}
	}
}
