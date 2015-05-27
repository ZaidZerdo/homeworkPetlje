package com.week2.homework1;

import java.util.Scanner;

public class Task10 {

	/*
	 * Prints the GCD for the given two numbers.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		input.close();
		
		// Start from any number and go to 1.
		// The first number that can divide both numbers
		// is definitely the GCD!
		for (int i = number1; i > 0; i--) {
			if (number1 % i == 0 && number2 % i == 0) {
				System.out.println("GCD: " + i);
				break; // Found the GCD, break the loop now
			}
		}
	}

}
