package com.week2.homework1;

import java.util.Scanner;

public class Task8 {

	/*
	 * Print all numbers from 2 to n that can
	 * be divided by the sum of its digits.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		// Go from 2 to n.
		for (int i = 2; i < n; i++) {
			// Find  the sum of its digits.
			int sum = 0;
			int temp = i; // Need this because i would get changed.
			while (temp != 0) {
				sum += (temp % 10);
				temp /= 10;
			}
			
			if (i % sum == 0) {
				System.out.println(i);
			}
		}
	}

}
