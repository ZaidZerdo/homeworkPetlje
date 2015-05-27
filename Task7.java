package com.week2.homework1;

import java.util.Scanner;

public class Task7 {

	/*
	 * Prints all magical (perfect) numbers from 2 to n.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		// Go from 2 to n.
		for (int i = 2; i < n; i++) {
			// Find  the sum of its divisors.
			int sum = 0;
			for (int j = 1; j < i; j++) {
				sum += (i % j == 0)? j : 0; // Add only if it can be divided
			}
			
			if (sum == i) {
				System.out.println(i);
			}
		}
		
	}

}
