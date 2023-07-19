package com.Digit.Test_Project.P1;

import java.util.Scanner;

class UnderageException extends Exception {
	public String getMessage() {
		return "Below";
	}
}

class OverageException extends Exception {
	public String getMessage() {
		return "Old";
	}
}

class Candidate {

	int age;

	void getData() {
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

	}

	void verify() throws Exception {
		if (age < 18) {
			UnderageException uae = new UnderageException();
			System.out.println(uae.getMessage());
			throw uae;
		} else if (age > 60) {
			OverageException oae = new OverageException();
			System.out.println(oae.getMessage());
			throw oae;
		} else {
			System.out.println("Issue the license");
		}
	}
}

class RTO {
	void grant(Candidate c) {
//		Custom
		//try {
//			c.getData();
//			c.verify();
//		} catch (Exception e) {
//			System.out.println("HAndled");
//		}

		//Nested Catch
		try {
			c.getData();
			c.verify();
		} catch (Exception e) {
			try {
				c.getData();
				c.verify();
			} catch (Exception e1) {
				try {
					c.getData();
					c.verify();
				} catch (Exception e2) {
					System.out.println("GO HOME");
				}

			}
		}
	}
}

public class Custom_Exception {
	public static void main(String[] args) {
		Candidate c1 = new Candidate();
		RTO r = new RTO();
		r.grant(c1);
	}
}
