package com.Digit.MultiThread;



class MSOffice1 extends Thread {
	public void run() {
		if (Thread.currentThread().getName().equals("Typing")) {
			typing();
		} else if (Thread.currentThread().getName().equals("Checking")) {
			checking();
		} else {
			saving();
		}
	}

	void typing() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Typing....");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void checking() {
		for (; ; ) {
			try {
				System.out.println("Checking....");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void saving() {
		for (; ; ) {
			try {
				System.out.println("Saving....");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Daemon_thread {
	public static void main(String[] args) {
		System.out.println("Start");
		MSOffice1 ms = new MSOffice1();
		ms.setName("Typing");

		MSOffice1 ms1 = new MSOffice1();
		ms1.setName("Checking");

		MSOffice1 ms2 = new MSOffice1();
		ms2.setName("Saving");

		ms1.setDaemon(true);
		ms2.setDaemon(true);
		ms1.setPriority(8);
		ms2.setPriority(9);
		ms.start();
		ms1.start();
		ms2.start();
	}
}
