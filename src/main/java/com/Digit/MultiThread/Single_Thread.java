package com.Digit.MultiThread;

import java.util.Scanner;

public class Single_Thread {
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Banking");
	System.out.println("Account");
	int acc=sc.nextInt();
	System.out.println("pin");
	int pin=sc.nextInt();

	System.out.println("Banking Completed");
	
	System.out.println("Printing");

	for(int i=0;i<5;i++) {
		System.out.println("hii");
		Thread.sleep(2000);
	}
	System.out.println("Printing Completed");
	
	System.out.println("Addition");
	
	System.out.println("Num1");
	int num1=sc.nextInt();
	System.out.println("Num2");
	int num2=sc.nextInt();
	
	int res=num1+num2;
	System.out.println(res);

	
}
}
