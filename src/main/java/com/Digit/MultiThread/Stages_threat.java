package com.Digit.MultiThread;

class Warrior extends Thread {
	String res1 = "Bramhastra";
	String res2 = "Sarpastra";
	String res3 = "Agnistra";

	public void run() {
		if (Thread.currentThread().getName().equals("Arjuna")) {
			arjun();
		} else if (Thread.currentThread().getName().equals("Karna")) {
			karna();
		}
	}

	private void karna() {
		try {
			synchronized (res1) {
				System.out.println("Karna" + res1);
				Thread.sleep(2000);
				synchronized (res2) {
					System.out.println("Karna" + res2);
					Thread.sleep(2000);
					synchronized (res3) {
						System.out.println("Karna" + res3);
						Thread.sleep(2000);
					}

				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void arjun() {
		// TODO Auto-generated method stub

		try {
			synchronized (res1) {
				System.out.println("Arjuna" + res1);
				Thread.sleep(2000);
				synchronized (res2) {
					System.out.println("Arjuna" + res2);
					Thread.sleep(2000);
					synchronized (res3) {
						System.out.println("Arjuna" + res3);
						Thread.sleep(2000);
					}

				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}

public class Stages_threat {
	public static void main(String[] args) {
		Warrior w1=new Warrior();
		w1.setName("Arjuna");
		
		Warrior w2=new Warrior();
		w2.setName("Karna");
		
		w1.start();
		w2.start();
		
		
		

	}
}
