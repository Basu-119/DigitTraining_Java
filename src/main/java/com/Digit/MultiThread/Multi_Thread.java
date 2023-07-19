package com.Digit.MultiThread;

import java.util.Scanner;

class Operation extends Thread {
	public void run() {
		if (Thread.currentThread().getName().equals("Banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("Printing")) {
			printing();
		}
		else {
			add();
		}
	}

	void banking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking");
		System.out.println("Account");
		int acc = sc.nextInt();
		System.out.println("pin");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
	}

	void printing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing");
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("hii");
				Thread.sleep(2000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing Completed");
	}

	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition");
		System.out.println("Num1");
		int num1 = sc.nextInt();
		System.out.println("Num2");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println(res);
	}
}

public class Multi_Thread {
	public static void main(String[] args) {
		System.out.println("Main Started");

		Operation op1=new Operation();
		op1.setName("Banking");
		Operation op2=new Operation();
		op2.setName("Printing");
		Operation op3=new Operation();
		op3.setName("add");
		
		op1.start();
		op2.start();
		op3.start();
		
		System.out.println("Main Terminated");
	}

}
