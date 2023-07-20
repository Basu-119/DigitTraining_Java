package com.Digit.Problems;

public class ProducerConsumer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2 q = new Queue2();
		Producer2 p = new Producer2(q);
		Consumer2 c = new Consumer2(q);
		p.start();
		c.start();
	}

}
