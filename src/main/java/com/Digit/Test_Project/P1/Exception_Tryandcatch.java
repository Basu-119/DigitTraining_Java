package com.Digit.Test_Project.P1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Tryandcatch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter NUmber1");
			int num1 = sc.nextInt();

			System.out.println("ENter NUmber1");
			int num2 = sc.nextInt();

			int res = num1 / num2;// Arithmatic Exception

			System.out.println("ENter size");
			int n = sc.nextInt();
			int arr[] = new int[n];

			int arr2[] = null;

			System.out.println("ENter Position");
			int pos = sc.nextInt();

			System.out.println("ENter value");
			int val = sc.nextInt();// IndexOutoofBound

			arr[pos] = val;
		} catch (ArithmeticException e1) {

			System.out.println("ArithmeticException");
		}
//		catch (NegativeArraySizeException e2) {
//
//			System.out.println("NegativeArraySizeException");
//		} catch (ArrayIndexOutOfBoundsException e3) {
//
//			System.out.println("ArrayIndexOutOfBoundsException");
//		} catch (InputMismatchException e4) {
//
//			System.out.println("InputMismatchException");
//		} catch (NullPointerException e5) {
//
//			System.out.println("NullPointerException");
//		}
		catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e2) {// Multi Catch Exception

			System.out.println("Array Exception");
		} catch (Exception e) {// Generic is the last catch block

			System.out.println(" Generic Exception HAndler");
		}

	}
}
