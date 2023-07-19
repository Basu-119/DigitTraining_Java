package com.Digit.MultiThread;

class MSOffice extends Thread {
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
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Checking....");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void saving() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Saving....");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Raceing_Thread {
	public static void main(String[] args) {
		System.out.println("Start");
		MSOffice ms = new MSOffice();
		ms.setName("Typing");

		MSOffice ms1 = new MSOffice();
		ms1.setName("Checking");

		MSOffice ms2 = new MSOffice();
		ms2.setName("Saving");

		ms.start();
		ms1.start();
		ms2.start();
	}
}
