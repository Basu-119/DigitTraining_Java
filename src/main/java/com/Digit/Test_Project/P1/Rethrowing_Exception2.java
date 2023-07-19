package com.Digit.Test_Project.P1;

import java.util.Scanner;

class Operation {
	void function1() throws Exception {// Throw exception to Function 2
		try {
			System.out.println("Function 1");

			Scanner sc = new Scanner(System.in);
			System.out.println("ENter NUmber1");
			int num1 = sc.nextInt();

			System.out.println("ENter NUmber1");
			int num2 = sc.nextInt();

			int res = num1 / num2;
			System.out.println(res);

		} catch (Exception e) {
			System.out.println("Handled by function 1");
			throw e;
		} finally {
			System.out.println("left 1");
		}
	}
}

public class Rethrowing_Exception2 {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Main");

			Operation op = new Operation();
			op.function1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled by the main");
		}
		System.out.println("Left main");
	}
}
