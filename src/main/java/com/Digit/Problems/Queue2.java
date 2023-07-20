package com.Digit.Problems;

public class Queue2 {
	int x;
	boolean value = false;

	synchronized void put(int i) {
		try {
			if (value != true) {
				x = i;
				System.out.println("Producer Produce" + x);
				value = true;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void get() {
		try {
			if (value != false) {
				System.out.println("Consumer Consume" + x);
				value = false;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
