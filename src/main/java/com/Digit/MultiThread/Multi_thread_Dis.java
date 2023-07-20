package com.Digit.MultiThread;

class Gender extends Thread {
	public void run() {
	try {
		System.out.println(Thread.currentThread().getName()+"ENtered"); 
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+"USing"); 
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+"Left"); 
		Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
}
}

public class Multi_thread_Dis {
public static void main(String[] args) throws InterruptedException {
	Gender g1=new Gender();
	g1.setName("Boy");
	
	Gender g2=new Gender();
	g2.setName("Girl");
	
	Gender g3=new Gender();
	g3.setName("Others");
	
	g1.start();
	g1.join();
	
	g2.start();
	g2.join();
	
	g3.start();
	g3.join();
}
}
