package com.Digit.Test_Project.P1;

import java.util.Scanner;

class Operations {
	void function1() throws Exception {//Throw exception to Function 2
		System.out.println("Function 1");

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter NUmber1");
		int num1 = sc.nextInt();

		System.out.println("ENter NUmber1");
		int num2 = sc.nextInt();

		int res = num1 / num2;
		System.out.println(res);
		System.out.println("left 1");


	}

	void function2() throws Exception {//Throw exception to Function 3
		System.out.println("Function 2");
		function1();
		System.out.println("left 2");

	}

	void function3() {//Handle The exception
		System.out.println("Function 3");
		try {
			function2();
		} catch (Exception e) {
			System.out.println("Handled");
		}
		System.out.println("left F3");

	}
}

public class Docking_Exception {
	public static void main(String[] args) {
		System.out.println("main");

		Operations op = new Operations();
		op.function3();
		System.out.println("left main");

	}
}
