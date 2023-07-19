package com.Digit.MultiThread;

import java.util.Scanner;

class Banking1 implements Runnable{
	public void run() {
		banking();
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

}

class Printing1 implements Runnable{
	
	public void run() {
		printing();
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
}

class Addition1 implements Runnable{
	public void run() {
		add();
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
public class Thread_Runnable {
public static void main(String[] args) {

	Banking1 b= new Banking1();
	Thread t1=new Thread(b);
	t1.start();
	
	Printing1 p=new Printing1();
	Thread t2=new Thread(p);
	t2.start();
	
	Addition1 a=new Addition1();
	Thread t3=new Thread(a);
	t3.start();

}
}
