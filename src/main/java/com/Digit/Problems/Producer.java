package com.Digit.Problems;

public class Producer extends Thread {
	Queue a;

	public Producer(Queue q) {
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
