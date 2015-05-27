package com.week2.homework1;

import java.util.Scanner;

public class Task3 {

	/*
	 * For a given number n it finds the sum of its digits.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		// Keep adding the last digit until
		// it reaches n = 0
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		
		System.out.println("Sum of its digits is " + sum);
		
	}

}
