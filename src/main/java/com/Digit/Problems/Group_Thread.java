package com.Digit.Problems;

public class Group_Thread implements Runnable {

	public static void main(String[] args) {
		Group_Thread g1=new Group_Thread();
		ThreadGroup tg1 = new ThreadGroup("Group-1");
Thread t1=new Thread(tg1, g1, "First Thread");
Thread t2=new Thread(tg1, g1, "Second Thread");
t1.start();
t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"-----"+Thread.currentThread().getThreadGroup());
	}

}
