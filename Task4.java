package com.week2.homework1;

import java.util.Scanner;

public class Task4 {

	/*
	 * A program that continuously takes input from the user and
	 * print the sum of its divisors until the given number is 0.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		do {
			n = input.nextInt(); // Take input from the user
			
			// Find the sum of its divisors
			int sum = 0;
			for (int i = 1; i < n; i++) {
				sum += (n % i == 0)? i: 0;
			}
			
			if (n != 0) {
				System.out.println("Sum of its divisors is " + sum);
			}
			
		} while (n != 0);
		
		input.close();
	}

}
