package com.Digit.Test_Project.P1;

import java.util.Scanner;

class PassException extends Exception {
	public String getMessage() {
		return "Enter Corrct";
	}
}

class User {
	String orgname = "Basu";
	String orgpass = "abcd";
	String name;
	String pass;

	void getData() {
		System.out.println("Enter name");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("Enter Pass");

		pass = sc.next();
	}

	void verify() throws Exception {
		if (name != "Basu" && pass != "abcd") {
			PassException pa = new PassException();
			System.out.println(pa.getMessage());
			throw pa;
		} else {
			System.out.println("Congratulation");
		}
	}
}

class Check {
	void grant(User c1) {
//		Custom
		// try {
//			c.getData();
//			c.verify();
//		} catch (Exception e) {
//			System.out.println("HAndled");
//		}

		// Nested Catch
		try {
			c1.getData();
			c1.verify();
		} catch (Exception e) {
			try {
				c1.getData();
				c1.verify();
			} catch (Exception e1) {
				try {
					c1.getData();
					c1.verify();
				} catch (Exception e2) {
					System.out.println("GO HOME");
				}

			}
		}
	}
}

public class Custom_Exception2 {
	public static void main(String[] args) {
		User c1 = new User();
		Check r = new Check();
		r.grant(c1);
	}
}
