package com.Digit.MultiThread;

import java.util.Scanner;

class Banking extends Thread{
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

class Printing extends Thread{
	
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

class Addition extends Thread{
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
public class Multi_Thread2 {
public static void main(String[] args) {
	
	Banking b= new Banking();
	b.start();
	
	Printing p=new Printing();
	p.start();
	
	Addition a=new Addition();
	a.start();
	
	
	
}
}
