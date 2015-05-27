package com.week2.homework1;

import java.util.Scanner;

public class Task2 {

	/*
	 * Finds the n-th Fibonacci number.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long first = 1;
		long second = 1;
		int n = input.nextInt();
		input.close();
		
		if (n < 2 || n > 50) {
			System.out.println("Error! (1 < n <= 50)");
			System.exit(0);
		}
				
		for (int i = 1; i < n; i++) {
			second = first + second; // Second is the sum of the two
			first = second - first;	 // First gets equal to second		
		}		
		
		System.out.println(first);
	}

}
